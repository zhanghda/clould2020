package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhanghda
 * @version 1.0
 * @date 2020/6/6 12:25
 */
@RestController
@Slf4j
public class OrderController {

//    private final String url = "http://localhost:8001";  生产者单机版
//生产者集群  要写那个服务的微服务名 ，但会报错，因为只是指定了微服务名，程序不知道要访问哪个 ，应该把restTemplate的负载均衡开启
    private final String url = "http://CLOUD-PAYMENT-SERVISE";

    @Resource
    private RestTemplate restTemplate;  //spring自己实现的远程调用

    @GetMapping("/consumer/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(url+ "/payment/get/"+id, CommonResult.class);
    }

    @GetMapping("/consumer/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(url+"/payment/create", payment,CommonResult.class);
    }
}
