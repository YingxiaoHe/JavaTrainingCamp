package com.example.redis.service;

import com.example.redis.mapper.UserMapper;
import com.example.redis.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 开启spring cache
     */
    @Cacheable(key = "#id", value = "userCache")
    public User find(int id) {
        log.info(" ==> find {}", id);
        return userMapper.find(id);
    }

    /**
     * 开启spring cache
     */
    @Cacheable(key = "methodName", value = "userCache")
    public List<User> list() {
        return userMapper.list();
    }
}
