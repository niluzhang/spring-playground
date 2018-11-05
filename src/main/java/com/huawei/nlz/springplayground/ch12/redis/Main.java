package com.huawei.nlz.springplayground.ch12.redis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RedisConfig.class);

        RedisTemplate<String, Role> redisTemplate = (RedisTemplate<String, Role>) applicationContext.getBean("redisTemplate");
        redisTemplate.opsForValue().set("19897", new Role("19897", new ArrayList<String>(){
            {
                add("789876");
                add("876789");
            }
        }));

        System.out.println(redisTemplate.opsForValue().get("19897"));

        StringRedisTemplate stringRedisTemplate = (StringRedisTemplate) applicationContext.getBean("stringRedisTemplate");
        stringRedisTemplate.opsForValue().set("time", new Date().toString());

        applicationContext.close();
    }

}
