package com.seata.stock.openfeignservice;

import com.seata.stock.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("seata-rm-order")
public interface OrderFeignService {

    @PostMapping("/createOrder")
    public String createOrder(@RequestBody Order order);
}
