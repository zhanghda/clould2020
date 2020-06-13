package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhanghda
 * @version 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient  //以后 无论是nacos或者Zookeeper 充当注册中心都用这个注解
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
