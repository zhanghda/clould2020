package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhanghda
 * @version 1.0
 * @date 2020/6/6 17:21
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7003.class,args);
    }
}
