package com.hogrider.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {

    @Resource
    private RedisTemplate redisTemplate;

    // 添加数据到Redis
    @PostMapping("/redis/addstring")
    public String addToRedis(String name, String value){

        //操作Redis中的String数据，得先获取 ValueOperations 对象
        ValueOperations valueOperations = redisTemplate.opsForValue();

        //添加数据到Redis
        valueOperations.set("myname", "kyoka");

        return "向Redis添加String类型数据";
    }

    // 从redis中获取数据
    @GetMapping("/redis/getk")
    public String getFromRedis(String k){

        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object v = valueOperations.get(k);

        return "key是" + "它的值是" + v;
    }
}
