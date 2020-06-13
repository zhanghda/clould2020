package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhanghda
 * @version 1.0
 * @date 2020/6/4 9:26
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    //注意 Autowired 默认要依赖的对象必须存在  如果允许null值，可以设置它required属性为false
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
