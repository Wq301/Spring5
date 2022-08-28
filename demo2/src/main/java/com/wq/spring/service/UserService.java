package com.wq.spring.service;

import com.wq.spring.dao.UserDao;
import com.wq.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-05-22 21:03
 */

@Component
public class UserService {
    //注入Dao
    @Autowired
    private UserDao userDao;



    //添加方法
    public void addUser(User user){
        userDao.add(user);
    }
    //修改
    public void updateUser(User user){
        userDao.update(user);
    }
    //删除
    public void deleteUser(int id){
        userDao.delete(id);
    }

    //查询表中数据条数
    public int userCount(){
        return userDao.findCount();
    }

    //根据数据id查询用户
    public User findUser(Integer id){
        return userDao.findUser(id);
    }
    //返回集合
    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        userDao.batchAddUser(batchArgs);
    }
    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        userDao.batchUpdateUser(batchArgs);
    }
    //批量添加
    public void batchDelete(List<Object[]> batchArgs){
        userDao.batchDeleteUser(batchArgs);
    }

}