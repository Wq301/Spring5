package com.wq.spring.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Description
 *
 * @author WangQian
 * @create 2022-06-08 10:22
 */
public class Emp {
    private String[] arr;
    private List<String> list;
    private Map<String,Object> map;

    private List<User> users;

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
    public void test(){
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println(map);
        System.out.println(users);
    }
}