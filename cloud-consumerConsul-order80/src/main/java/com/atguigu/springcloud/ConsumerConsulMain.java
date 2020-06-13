package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhanghda
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsulMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulMain.class,args);
    }
}
