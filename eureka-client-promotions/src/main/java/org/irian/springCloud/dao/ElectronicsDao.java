package org.irian.springCloud.dao;

import org.springframework.stereotype.Component;

/**
 * Created by IrianLaptop on 7/17/2016.
 */

@Component(value = DaoFactory.ELECTRONICS_DAO)
public class ElectronicsDao extends ProductDaoImpl {
    @Override
    public String getProductType() {
        return ELECTRONICS_CLIENT;
    }
}
