package com.example.order.service;

import com.example.order.feign.StoreFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;


@Service
public class OrderService {

//    private static final long serialVersionUID = 67892543L;

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private StoreFeign storeFeign;

    public String OrderServiceAdd() {

        String store = storeFeign.store();
        logger.info("order-8000: add order =====>" + store);

        return "order-8000: add order =====>" + store;
    }


}
