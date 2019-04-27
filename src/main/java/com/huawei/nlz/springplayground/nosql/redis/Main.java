package com.huawei.nlz.springplayground.nosql.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RedisConfig.class);

        RedisTemplate<String, Role> redisTemplate = (RedisTemplate<String, Role>) applicationContext.getBean("redisTemplate");
        redisTemplate.opsForValue().set("19897", new Role("19897", new ArrayList<String>() {
            {
                add("789876");
                add("876789");
            }
        }));

        if (log.isInfoEnabled()) {
            log.info(String.valueOf(redisTemplate.opsForValue().get("19897")));
        }

        StringRedisTemplate stringRedisTemplate = (StringRedisTemplate) applicationContext.getBean("stringRedisTemplate");
        stringRedisTemplate.opsForValue().set("time", new Date().toString());

        /**
         * Redis事务demo
         */
        stringRedisTemplate.execute(new SessionCallback<Void>() {
            @Override
            public <K, V> Void execute(RedisOperations<K, V> operations) throws DataAccessException {
                String watchedKey = "school";
                operations.watch((K)watchedKey);
                if(log.isInfoEnabled()){
                    log.info("watching {}", watchedKey);
                }
                operations.multi();
                try {
                    /**
                     * 让线程睡眠10秒钟，在这段时间里你可以打开其他redis客户端修改watchedKey对应的值
                     */
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                operations.opsForValue().set((K)"name", (V)"nlz");
                List<Object> list = operations.exec();
                /**
                 * 如果没有通过其他客户端修改watchedKey，那么这里事务能执行成功，name被改为nlz，list为[true];
                 * 如果通过其他客户端修改了watchedKey，那么事务就执行失败，name未能改成nlz，list为[]。
                 */
                if(log.isInfoEnabled()){
                    log.info("transaction result is {}", list);
                }

                return null;
            }
        });

        applicationContext.close();
    }

}
