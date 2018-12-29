package com.dhcc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value="com.dhcc")
@MapperScan(value="com.dhcc")
public class CapabilityresourcemanageApplication {
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() { return new RestTemplate();}
	
	public static void main(String[] args) {
		SpringApplication.run(CapabilityresourcemanageApplication.class, args);
	}
}
