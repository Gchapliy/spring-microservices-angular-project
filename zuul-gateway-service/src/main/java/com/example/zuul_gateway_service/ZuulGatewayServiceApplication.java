package com.example.zuul_gateway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
public class ZuulGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayServiceApplication.class, args);
    }

}
