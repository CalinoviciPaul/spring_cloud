package org.irian.springCloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IrianLaptop on 7/10/2016.
 */
@RestController
public class LuckyProductController {

    @Value("${lucky-product}") String luckyProduct;


    @RequestMapping("/lucky-product")
    public String getLuckyProduct(){
        return luckyProduct;
    }
}
