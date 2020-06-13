package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhanghda
 * @version 1.0
 * @date 2020/6/6 12:23
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  //开启restTemplate 的负载均衡功能
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
