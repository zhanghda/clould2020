package com.atguigu.springcloud.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhanghda
 * @version 1.0
 */
@RestController
public class ConsumerConsulController {

    private static final String URL = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/consumer/payment/consul")
    public String getProvider(){
        return restTemplate.getForObject(URL+"/payment/consul",String.class);
    }
}
