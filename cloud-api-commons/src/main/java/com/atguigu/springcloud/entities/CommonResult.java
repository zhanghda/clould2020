package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回实体类
 * @author zhanghda
 * @version 1.0
 * @date 2020/6/3 21:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private int    code;
    private String message;
    private T      data;

    public CommonResult(int code, String message){
        this.code = code;
        this.message = message;
    }
}
