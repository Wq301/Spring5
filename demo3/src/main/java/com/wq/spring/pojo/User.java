package com.wq.spring.pojo;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-06-08 10:53
 */
public class User {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}