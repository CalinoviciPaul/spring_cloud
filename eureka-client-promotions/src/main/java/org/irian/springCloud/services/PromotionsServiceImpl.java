package org.irian.springCloud.services;

import com.netflix.discovery.converters.Auto;
import org.irian.springCloud.dao.DaoFactory;
import org.irian.springCloud.dao.ProductDao;
import org.irian.springCloud.feignClients.ElectronicsClient;
import org.irian.springCloud.feignClients.FoodClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by IrianLaptop on 7/17/2016.
 */
@Service
public class PromotionsServiceImpl implements PromotionsService {

    /*ProductDao foodDao;

    ProductDao electronicsDao;*/

   /* @Autowired
    FoodClient foodClient;
    @Autowired
    ElectronicsClient electronicsClient;*/

    @Autowired
    ProductsService productsService;

   /* @Override
    public String getPromotions() {
        String header = "Here are the promotional products: ";
        return String.format("%s\n Food:%s\n Electronics%s",
                header,
                foodDao.getProduct(),
                electronicsDao.getProduct());
    }  */

    @Override
    public String getPromotions() {
        String header = "Here are the promotional products: ";
        return String.format("%s\\n Food:%s\\n Electronics: %s",
                header,
                productsService.getFoodProduct(),
                productsService.getElectronicsProduct());
    }

  /*  @Autowired
    @Qualifier(DaoFactory.FOOD_DAO)
    public void setFoodDao(ProductDao foodDao) {
        this.foodDao = foodDao;
    }

    @Autowired
    @Qualifier(DaoFactory.ELECTRONICS_DAO)
    public void setElectronicsDao(ProductDao electronicsDao) {
        this.electronicsDao = electronicsDao;
    }*/
}
