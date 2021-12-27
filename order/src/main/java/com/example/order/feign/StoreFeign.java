package com.example.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "store-service", path = "/store")
public interface StoreFeign {

    @RequestMapping(path = "/instance", method = RequestMethod.GET)
    public String store();

}
