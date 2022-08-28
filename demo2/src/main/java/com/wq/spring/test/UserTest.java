package com.wq.spring.test;

import com.wq.spring.entity.User;
import com.wq.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-05-22 21:28
 */
public class UserTest {
    @Test
    public void insertTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        //手动输入值，一般是前端获取
        User user=new User();
        user.setUserId(1);
        user.setUsername("wq");
        user.setPassword("184034");
        userService.addUser(user);

    }
    @Test
    public void updateTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        //修改
        User user=new User();
        user.setUserId(1);
        user.setUsername("abc");
        user.setPassword("111111");
        userService.updateUser(user);
    }

    @Test
    public void deleteTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        //删除
        userService.deleteUser(1);
    }
    @Test
    public void countTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        int count = userService.userCount();
        System.out.println("记录条数有： " + count);
    }

    @Test
    public void findUserById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        User user = userService.findUser(2);
        System.out.println(user);
    }

    @Test
    public void findAllUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        List<User> users = userService.getAllUser();
        System.out.println(users);
    }

    @Test
    public void batchAddUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        List<Object[]> batchArgs=new ArrayList<>();
        Object[] o1={"1","AAA","a"};
        Object[] o2={"2","BBB","b"};
        Object[] o3={"3","CCC","c"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        userService.batchAdd(batchArgs);
    }

    @Test
    public void batchUpdateUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        List<Object[]> batchArgs=new ArrayList<>();
        Object[] o2={"BBB-XXX","b2","2"};
        Object[] o3={"CCC-XXX","c3","3"};
        batchArgs.add(o2);
        batchArgs.add(o3);
        userService.batchUpdate(batchArgs);
    }

    @Test
    public void batchDeleteUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        List<Object[]> batchArgs=new ArrayList<>();
        Object[] o2={"2"};
        Object[] o3={"4"};
        batchArgs.add(o2);
        batchArgs.add(o3);
        userService.batchDelete(batchArgs);
    }
}