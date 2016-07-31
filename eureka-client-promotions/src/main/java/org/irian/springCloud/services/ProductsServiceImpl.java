package org.irian.springCloud.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.irian.springCloud.feignClients.ElectronicsClient;
import org.irian.springCloud.feignClients.FoodClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IrianLaptop on 7/31/2016.
 */
@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    FoodClient foodClient;
    @Autowired
    ElectronicsClient electronicsClient;


    @Override
    @HystrixCommand(fallbackMethod = "getFallbackElectronicsProduct")
    public String getElectronicsProduct() {
        return electronicsClient.getProduct();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackFoodProduct")
    public String getFoodProduct() {
        return foodClient.getProduct();
    }

    public String getFallbackElectronicsProduct(){
        return "coffee-maker";
    }

    public String getFallbackFoodProduct(){
        return "Yoghurt";
    }
}
