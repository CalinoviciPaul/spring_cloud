package org.irian.springCloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IrianLaptop on 7/13/2016.
 */
@RestController
public class PromotionalProducts {

    @Value("${products}") String products;

    @RequestMapping("/")
    public @ResponseBody String getProducts() {
        String[] productsArray = products.split(",");
        int i = (int)Math.round(Math.random() * (productsArray.length - 1));
        return productsArray[i];
    }

}
