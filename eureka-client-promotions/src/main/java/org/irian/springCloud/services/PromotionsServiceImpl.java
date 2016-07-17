package org.irian.springCloud.services;

import org.irian.springCloud.dao.DaoFactory;
import org.irian.springCloud.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by IrianLaptop on 7/17/2016.
 */
@Service
public class PromotionsServiceImpl implements PromotionsService {

    ProductDao foodDao;

    ProductDao electronicsDao;

    @Override
    public String getPromotions() {
        String header = "Here are the promotional products: ";
        return String.format("%s\n Food:%s\n Electronics%s",
                header,
                foodDao.getProduct(),
                electronicsDao.getProduct());
    }

    @Autowired
    @Qualifier(DaoFactory.FOOD_DAO)
    public void setFoodDao(ProductDao foodDao) {
        this.foodDao = foodDao;
    }

    @Autowired
    @Qualifier(DaoFactory.ELECTRONICS_DAO)
    public void setElectronicsDao(ProductDao electronicsDao) {
        this.electronicsDao = electronicsDao;
    }
}
