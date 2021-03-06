package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zhanghda
 * @version 1.0
 * @date 2020/6/4 9:36
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){  //这里注意服务提供者如果不加RequestBody注解，消费者调用时参数会丢失
        int i = paymentService.create(payment);
        if(i > 0){
            log.info("插入成功" + i);
            return new CommonResult(200,"新增成功+serverPort: "+serverPort,i);
        }else {
            return new CommonResult(500,"新增失败" + payment,"");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        if(paymentById != null){
            log.info("查询成功" + paymentById);
            return new CommonResult(200,"查询成功,serverPort: " + serverPort,paymentById);
        }else {
            return new CommonResult(500,"查询失败，没有对应id"+ id,"");
        }
    }
}
