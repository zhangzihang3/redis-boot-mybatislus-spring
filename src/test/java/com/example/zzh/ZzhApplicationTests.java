package com.example.zzh;


import com.example.zzh.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(SpringRunner.class)
class ZzhApplicationTests {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        System.out.println(userService.getById(1));
    }

    @Test
    void contextLoads2() {
        redisTemplate.opsForValue().set("1", "1");
        System.out.println("------");
        System.out.println(redisTemplate.opsForValue().get("1"));
    }
}
