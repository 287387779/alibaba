package com.example.order.controller;


import com.example.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @Value("${info.test}")
    private String logConfig;

    @GetMapping(path = "/instance")
    public String add() {
/*
        @PathVariable   -->接收path参数
        @RequestParam   -->接收query参数
        @RequestBody    -->接收body参数
        @RequestHeader  -->接收header参数
        @CookieValue    -->接收cookie
        也可以直接用(HttpServletRequest request)
*/
        String orderServiceAddResult = orderService.OrderServiceAdd();
        return "order-8000: add order =====>" + orderServiceAddResult + logConfig;
    }

}
