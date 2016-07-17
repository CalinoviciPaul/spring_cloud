package org.irian.springCloud.feignClients;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IrianLaptop on 7/17/2016.
 */
@FeignClient("eureka-client-electronics")
public interface ElectronicsClient extends ProductClient{

}
