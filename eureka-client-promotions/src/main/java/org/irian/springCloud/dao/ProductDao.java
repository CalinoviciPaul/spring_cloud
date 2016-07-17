package org.irian.springCloud.dao;

/**
 * Created by IrianLaptop on 7/17/2016.
 */
public interface ProductDao {
     static final String ELECTRONICS_CLIENT = "eureka-client-electronics";
     static final String FOOD_CLIENT = "eureka-client-food";

     String getProduct();
}
