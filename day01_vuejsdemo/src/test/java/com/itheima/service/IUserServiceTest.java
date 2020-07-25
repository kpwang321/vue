package com.itheima.service;

import com.itheima.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author kpwang
 * @create 2020-07-25 12:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class IUserServiceTest {
    @Autowired
    private IUserService userService;
    @Test
    public void findaAll() {
        List<User> list = userService.findaAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void findById() {
        User user = userService.findById(2);
        System.out.println(user);
    }

    @Test
    public void updateUser() {
        User user = userService.findById(2);
        user.setUsername("李沁");
        user.setSex("女");
        userService.updateUser(user);
    }
}