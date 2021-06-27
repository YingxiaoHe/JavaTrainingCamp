package com.training.camp.repo;

import com.google.gson.Gson;
import com.training.camp.model.User;
import com.training.camp.util.RandomUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserAddBatchRepo userAddBatchRepo;

    RandomUtils<User> randomUtils = new RandomUtils<>(User.class);

    @Before
    public void clearUser() {
        userRepo.deleteAll();
    }

    @Test
    public void test() {
        log.info("-----------------");
    }

    @Test
    public void insertOneUser() {
        long startTime = System.currentTimeMillis();
        User user = randomUtils.createRandomDTO();
        log.info("user:{}", new Gson().toJson(user));
        userRepo.saveAndFlush(user);
        log.info("{}秒", (double) (System.currentTimeMillis() - startTime) / 1000);
        // 0.117s
    }

    @Test
    public void ongByOneInsertUser() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            User user = randomUtils.createRandomDTO();
            userRepo.saveAndFlush(user);
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        log.info("{}秒", (double) time / 1000);
        // 1k 39.976s
    }

    /**
     * saveAll本质也是一个一个插入
     */
    @Test
    public void allInsertUser() {
        long startTime = System.currentTimeMillis();
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            userList.add(randomUtils.createRandomDTO());
        }
        userRepo.saveAll(userList);
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        log.info("{}秒", (double) time / 1000);
        // 1w 89.354s
    }

    /**
     * 速度反而变慢了
     */
    @Test
    public void batchInsertUser() {
        long startTime = System.currentTimeMillis();
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            userList.add(randomUtils.createRandomDTO());
        }
        userAddBatchRepo.batchSave(userList);
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        log.info("{}秒", (double) time / 1000);
        // 1w 97.05s
        // 1w 96.518s
    }

}
