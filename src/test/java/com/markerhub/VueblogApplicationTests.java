package com.markerhub;

import com.markerhub.mapper.UserMapper;
import com.markerhub.service.UserService;
import com.markerhub.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class VueblogApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        redisTemplate.opsForValue().set("mykey","kangshen");
        System.out.println(redisTemplate.opsForValue().get("mykey"));
        redisUtil.set("Bob",123456);
        System.out.println(redisUtil.get("Bob"));
    }

}
