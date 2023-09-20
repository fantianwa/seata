package com.seata.order.service.impl;

import com.seata.order.entity.Order;
import com.seata.order.mapper.OrderMapper;
import com.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void createOrder(Order order) {
        System.out.println("xxxxxxxxxxxxxx" + order);
        orderMapper.insert(order);
    }
}
