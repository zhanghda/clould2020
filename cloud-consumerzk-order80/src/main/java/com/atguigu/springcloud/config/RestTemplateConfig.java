package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhanghda
 * @version 1.0
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced //开启RestTemplate负载均衡自动寻找正常服务器的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
