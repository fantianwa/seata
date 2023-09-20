package com.seata.stock.controller;

import com.seata.stock.entity.Stock;
import com.seata.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
public class StockApi {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private StockService stockService;

    @Value("${spring.datasource.url}")
    private String url;

    @GetMapping("/services")
    public List<ServiceInstance> getServices() {
        return discoveryClient.getInstances("seata-rm-stock");
    }


    @PostMapping("/reduceStock")
    public String reduceStock(@RequestBody Stock stock) {
        stockService.reduceStock(stock);
        return "success";
    }

    @GetMapping("/reduceStock1")
    public String reduceStock1(@RequestParam("id") Integer id, @RequestParam("count") Integer count) {
        Stock stock = new Stock();
        stock.setId(id);
        stock.setCount(count);
        stockService.reduceStock(stock);
        return "success";
    }

    @GetMapping("/getNacosConfig")
    public String getNacosConfig() {
        return url;
    }
}
