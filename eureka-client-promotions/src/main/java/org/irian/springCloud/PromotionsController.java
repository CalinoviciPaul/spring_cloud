package org.irian.springCloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Created by IrianLaptop on 7/14/2016.
 */
@RestController
public class PromotionsController {
    @Autowired
    DiscoveryClient discoveryClient;


    @RequestMapping("/promotions")
    public @ResponseBody String getProducts() {
        return
                getProduct("eureka-client-electronics") + " "
                        + getProduct("eureka-client-food")
                ;
    }

    public String getProduct(String service) {
        List<ServiceInstance> list = discoveryClient.getInstances(service);
        if (list != null && list.size() > 0 ) {
            URI uri = list.get(0).getUri();
            if (uri !=null ) {
                return (new RestTemplate()).getForObject(uri,String.class);
            }
        }
        return null;
    }


}
