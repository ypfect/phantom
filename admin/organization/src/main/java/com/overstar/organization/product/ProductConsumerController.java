package com.overstar.organization.product;

import com.overstar.organization.feign.IConsumerProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/8/6 23:46
 */
@RequestMapping
@RestController
public class ProductConsumerController {

    @Autowired
    private IConsumerProduct consumerProduct;

    @RequestMapping("/or/hello")
    public String getHello(){
        return consumerProduct.getMessageFromProduct();
    }
}
