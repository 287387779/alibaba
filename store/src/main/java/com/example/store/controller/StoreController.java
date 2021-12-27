package com.example.store.controller;


import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    private static final Logger logger = LoggerFactory.getLogger(StoreController.class);

    @RequestMapping(path = "/instance", method = RequestMethod.GET)
    public String store() {
        logger.info("store-8010: subtract store");
        return "store-8010: subtract store";
    }

}
