package org.irian.springCloud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IrianLaptop on 7/17/2016.
 */
public abstract class ProductDaoImpl implements ProductDao{

    @Autowired
    LoadBalancerClient loadBalancerClient;

    public abstract String getProductType();

    @Override
    public String getProduct() {
        ServiceInstance serviceInstance = loadBalancerClient.choose(getProductType());
        return (new RestTemplate()).getForObject(serviceInstance.getUri(),String.class);
    }
}
