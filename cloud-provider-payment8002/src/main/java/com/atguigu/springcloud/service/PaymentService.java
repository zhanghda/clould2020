package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @author zhanghda
 * @version 1.0
 * @date 2020/6/3 22:19
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);
}
