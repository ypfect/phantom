package com.overstar.gateway.web;

import com.overstar.gateway.service.RedissonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/8/7 23:20
 */
@RestController
public class TestRedissonController {

    @Autowired
    private RedissonService redissonService;

    @RequestMapping("/setRedisson/{key}/{value}")
    public String setValue(@PathVariable("key") String key,@PathVariable("value")String value){
        return redissonService.setRedisValue(key,value);

    }

    @RequestMapping("/getRedisson")
    public String getValue(@RequestParam String key){
        return redissonService.getRedisValue(key);
    }
}
