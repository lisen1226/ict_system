package com.dhcc;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.github.pagehelper.PageHelper;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value="com.dhcc")
public class CapabilityresourcemanageApplication {
	
	
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() { return new RestTemplate();}
	//配置mybatis的分页插件pageHelper
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(CapabilityresourcemanageApplication.class, args);
	}
}
