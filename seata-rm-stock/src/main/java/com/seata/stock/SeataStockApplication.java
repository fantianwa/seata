package com.seata.stock;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableAutoDataSourceProxy(dataSourceProxyMode = "AT")
@MapperScan("com.seata.stock.mapper")
@EnableFeignClients
@SpringBootApplication
public class SeataStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeataStockApplication.class, args);
	}

}
