package com.overstar.gateway.service;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/8/7 23:18
 */
@Service
public class RedissonService {
    @Autowired
    private RedissonClient redissonClient;

    public String setRedisValue(String key,String value){
        RBucket<String> bucket = redissonClient.getBucket(key);
        bucket.set(value);
        return "吃了";
    }

    public String getRedisValue(String key){
        RBucket<String> bucket = redissonClient.getBucket(key);
        return bucket.get();
    }
}
