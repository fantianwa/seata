package com.seata.tm.openfeignservice;

import com.seata.tm.requestentity.Request;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("seata-rm-stock")
public interface StockFeignService {

    @PostMapping("/reduceStock")
    public String reduceStock(@RequestBody Request request);
}
