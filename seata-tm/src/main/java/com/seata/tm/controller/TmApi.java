package com.seata.tm.controller;

import com.seata.tm.requestentity.Request;
import com.seata.tm.requestentity.Stock;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
@RefreshScope
public class TmApi {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${seata.tx-service-group}")
    private String group;

    @PostMapping("/testSeata")
    @GlobalTransactional(timeoutMills = 5000)
    public String testSeata(@RequestBody Request request) {
        restTemplate.postForObject("http://seata-rm-stock/reduceStock", request, String.class);
        return "success";
    }

    @GetMapping("/testSeata1")
    @GlobalTransactional(timeoutMills = 3000)
    public String testSeata1(@RequestParam("id") Integer id, @RequestParam("count") Integer count) {
        restTemplate.getForObject("http://seata-rm-stock/reduceStock1?id={id}&count={count}", String.class, new HashMap<String,Integer>(){{put("id", id); put("count", count);}});
        return "success";
    }

    @GetMapping("/getNacosConfig")
    public String getNacosConfig() {
        return group;
    }


}
