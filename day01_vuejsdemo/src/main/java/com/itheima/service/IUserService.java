package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-25 12:50
 */
public interface IUserService {
    List<User> findaAll();
    User findById(Integer userId);
    void updateUser(User user);
}
