package com.atguigu.orderservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients    //服务调用
@EnableDiscoveryClient  //nacos注册
@ComponentScan("com.atguigu")
@MapperScan("com.atguigu.orderservice.mapper")
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(OrderApplication.class, args);
        }catch (Exception e) {
        e.printStackTrace();
    }

    }

}
