package com.seata.tm;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableAutoDataSourceProxy(dataSourceProxyMode = "AT")
@EnableFeignClients
@SpringBootApplication
public class SeataTmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeataTmApplication.class, args);
	}

}
