package com.cykj.demo_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DemoWebApplication {

   @Bean //??
    @LoadBalanced //加入@LoadBalanced注解，就可以为RestTemplate加入负载均衡的能力
    public RestTemplate restTemplate()
    {
        return  new RestTemplate();
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }

}

