package com.wq.spring.test;

import com.wq.spring.config.SpringConfig;
import com.wq.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-06-08 11:25
 */
public class ParamTest {
    @Test
    public void stuTest(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = context.getBean(Student.class);
        System.out.println("student = " + student);
    }
}