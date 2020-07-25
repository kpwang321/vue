package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-25 3:40
 */
public interface IUserDao {
    //查询用户列表
    @Select("select * from user")
    List<User> findaAll();
    @Select("select * from user where id=#{userId}")
    User findById(Integer userId);
    @Update("update user set username=#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);
}
