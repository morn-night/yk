package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import redis.clients.jedis.Jedis;

@RunWith(SpringJUnit4ClassRunner.class)
@PropertySource(value = {"classpath:application.properties"})
@SpringBootTest
public class DemoApplicationTests {



    @Test
    public void contextLoads() {
//        Jedis jedis=new Jedis("192.168.13.129",6379);
//        System.out.println();
    }

    @Autowired
    private RedisTemplate redisTemplate;


    // redis测试
    @Test
    public void redisTest(){
        // 设置键名


        String redisKey = "test:count";
        // 设置键值
        redisTemplate.opsForValue().set(redisKey,1);
        // 获取这个键
        System.out.println(redisTemplate.opsForValue().get(redisKey));
        // 对键值加3
        System.out.println(redisTemplate.opsForValue().increment(redisKey,3));
        // 对键值减3
        System.out.println(redisTemplate.opsForValue().decrement(redisKey,3));
    }




}


