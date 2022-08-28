package com.wq.spring.dao;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-05-20 15:33
 */
public class User {
    private String name;
    private Dept dept;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add() {
        System.out.println("User.add()...");
    }

}