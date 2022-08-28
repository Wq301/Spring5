package com.wq.spring.dao;

import com.wq.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-05-22 21:03
 */

@Component
public class UserDaoImpl implements UserDao{
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(User user) {
        //创建sql语句
        String sql="insert into t_user values(?,?,?)";
        //调用方法实现
        Object[] args={ user.getUserId(), user.getUsername(), user.getPassword()};
        int rows = jdbcTemplate.update(sql,args);
        System.out.println("rows = " + rows);
    }

    @Override
    public void update(User user) {
        String sql="update t_user set username=?,password=? where user_id=?";
        Object[] args={ user.getUsername(), user.getPassword(), user.getUserId()};
        int rows = jdbcTemplate.update(sql,args);
        System.out.println("rows = " + rows);
    }

    @Override
    public void delete(int id) {
        String sql="delete from t_user where user_id=?";
        int rows = jdbcTemplate.update(sql,id);
        System.out.println("rows = " + rows);
    }

    @Override
    public int findCount() {
        String sql="select count(*) from t_user";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public User findUser(Integer id) {
        String sql="select * from t_user where user_id=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        String sql="select * from t_user";
        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public void batchAddUser(List<Object[]> batchArgs) {
        String sql="insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdateUser(List<Object[]> batchArgs) {
        String sql="update t_book set name=?,password=? where book_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteUser(List<Object[]> batchArgs) {
        String sql="delete from t_book where book_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}