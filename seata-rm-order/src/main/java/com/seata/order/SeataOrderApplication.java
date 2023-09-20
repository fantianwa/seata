package com.seata.order;


import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableAutoDataSourceProxy(dataSourceProxyMode = "AT")
@MapperScan("com.seata.order.mapper")
@SpringBootApplication
public class SeataOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeataOrderApplication.class, args);
	}

}
