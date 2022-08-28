package com.wq.spring.dao;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-05-20 15:51
 */
public class Dept {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}