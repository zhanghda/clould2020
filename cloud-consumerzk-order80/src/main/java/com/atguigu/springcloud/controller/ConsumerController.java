package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhanghda
 * @version 1.0
 */
@RestController
public class ConsumerController {

    public static final String httpUrl = "http://cloud-provider-payment8004";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/cousumer/payment/zk")
    public String getCousumer(){
        return restTemplate.getForObject(httpUrl+"/payment/zk", String.class);
    }

}
