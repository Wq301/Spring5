package com.wq.spring.test;

import com.wq.spring.pojo.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-06-08 10:27
 */
public class ArrTest {
    @Test
    public void arrayTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Emp emp = context.getBean(Emp.class);
        emp.test();
    }
}