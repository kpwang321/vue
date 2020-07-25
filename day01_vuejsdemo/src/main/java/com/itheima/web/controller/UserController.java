package com.itheima.web.controller;

import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-25 13:06
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/findAll")
    public List<User> findAll(){
        System.out.println("-------");
        return userService.findaAll();
    }
    @RequestMapping("/findById")
    public User findUserById(Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return user;

    }
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
}
