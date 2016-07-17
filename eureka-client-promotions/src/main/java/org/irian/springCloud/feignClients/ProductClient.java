package org.irian.springCloud.feignClients;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IrianLaptop on 7/17/2016.
 */
public interface ProductClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getProduct();
}
