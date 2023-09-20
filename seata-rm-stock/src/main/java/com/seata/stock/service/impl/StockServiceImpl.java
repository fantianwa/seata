package com.seata.stock.service.impl;

import com.seata.stock.entity.Order;
import com.seata.stock.entity.Stock;
import com.seata.stock.mapper.StockMapper;
import com.seata.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void reduceStock(Stock stock) {
        //减少库存
        stockMapper.reduceStock(stock);
        //创建订单
        Order order = new Order();
        order.setStockId(stock.getId());
        order.setUserName(stock.getUserName());
        restTemplate.postForObject("http://seata-rm-order/createOrder", order, String.class);
    }
}
