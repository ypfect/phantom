package com.overstar.product.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/8/6 20:55
 */
@RestController
@RefreshScope
public class ProductHelloController {

    @Value("${firstValueFromNacos:}")
    private String firstValueFromNacos;

    @RequestMapping("/getNacos")
    public String getNacosValue(){
        return firstValueFromNacos;
    }
}
