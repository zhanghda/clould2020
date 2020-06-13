package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhanghda
 * @version 1.0
 * @date 2020/6/6 12:21
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment implements Serializable {

    private int id;
    private String serial;
}
