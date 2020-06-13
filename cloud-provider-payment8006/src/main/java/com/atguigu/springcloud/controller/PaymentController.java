package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author zhanghda
 * @version 1.0
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    String serverPort;

    @RequestMapping("/payment/consul")
    public String payment(){
        return "application consul post:" + serverPort + "  " + UUID.randomUUID().toString();
    }
}
