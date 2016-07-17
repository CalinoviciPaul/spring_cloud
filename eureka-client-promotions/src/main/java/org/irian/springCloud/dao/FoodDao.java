package org.irian.springCloud.dao;

import org.springframework.stereotype.Component;

/**
 * Created by IrianLaptop on 7/17/2016.
 */

@Component(value = DaoFactory.FOOD_DAO)
public class FoodDao extends ProductDaoImpl {
    @Override
    public String getProductType() {
        return FOOD_CLIENT;
    }
}
