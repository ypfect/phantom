package com.overstar.organization.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/8/7 22:23
 */
@FeignClient(name = "service-product")
public interface IConsumerProduct {

    @RequestMapping("/getNacos")
    String getMessageFromProduct();
}
