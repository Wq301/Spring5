package com.wq.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-06-08 11:22
 */
@Component
public class Student {
    @Value(value="18")
    private Integer id;
    @Value(value="hahhahhah")
    private String name;



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}