package org.irian.springCloud.services;

import org.irian.springCloud.feignClients.ElectronicsClient;
import org.irian.springCloud.feignClients.FoodClient;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IrianLaptop on 7/31/2016.
 */
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    FoodClient foodClient;
    @Autowired
    ElectronicsClient electronicsClient;


    @Override
    public String getElectronicsProduct() {
        return electronicsClient.getProduct();
    }

    @Override
    public String getFoodProduct() {
        return foodClient.getProduct();
    }
}
