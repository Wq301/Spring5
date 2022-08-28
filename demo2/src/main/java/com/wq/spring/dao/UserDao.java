package com.wq.spring.dao;

import com.wq.spring.entity.User;

import java.util.List;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-05-22 21:02
 */
public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(int id);

    int findCount();

    User findUser(Integer id);

    List<User> getAllUser();

    void batchAddUser(List<Object[]> batchArgs);
    void batchUpdateUser(List<Object[]> batchArgs);
    void batchDeleteUser(List<Object[]> batchArgs);

}
