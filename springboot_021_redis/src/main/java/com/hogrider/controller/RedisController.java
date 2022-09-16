package com.hogrider.controller;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    // 添加数据到Redis
    @PostMapping("/redis/addstring")
    public String addToRedis(String name,String value){

        //操作Redis中的String数据，得先获取 ValueOperations 对象
        ValueOperations valueOperations = redisTemplate.opsForValue();

        //添加数据到Redis
        valueOperations.set( "myname", "kyoka");
        valueOperations.set( "age", 20);

        return "向Redis添加String类型数据";
    }

    // 从redis中获取数据
    @GetMapping("/redis/getk")
    public String getFromRedis(   String k){

        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object v = valueOperations.get("myname");
        Object age = valueOperations.get("age");

        return "key是" + "它的值是" + v + "age: " + age;
    }

    /**
     *
     * @param k
     * @param v
     * @return
     *
     * postman 测试，使用 POST 方法，http://localhost/myredis/redis/stunum/20
     */
    @PostMapping("/redis/{k}/{v}")
    public String addStringKV( @PathVariable  String k,
                               @PathVariable  String v){
        ValueOperations stringStringValueOperations = stringRedisTemplate.opsForValue();
        stringStringValueOperations.set(k, v);
        return "往redis添加StringTemplate数据 K: " + k + ",V: " + v;
    }

    //获取数据
    @GetMapping("/redis/{k}")
    public String getStringData( @PathVariable String k){
        String v = stringRedisTemplate.opsForValue().get(k);
        return "从redis用stringtemplate获取数据V： " + v;
    }
}
