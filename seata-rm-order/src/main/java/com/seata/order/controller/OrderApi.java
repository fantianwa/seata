package com.seata.order.controller;

import com.seata.order.entity.Order;
import com.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderApi {

    @Autowired
    private OrderService orderService;

    @PostMapping("/createOrder")
    public String createOrder(@RequestBody Order order) {
        orderService.createOrder(order);
        return "success";
    }
}
