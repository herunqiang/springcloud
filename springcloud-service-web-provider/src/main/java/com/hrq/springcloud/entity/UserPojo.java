package com.hrq.springcloud.entity;

import java.io.Serializable;

/**
 * @Author 何润强
 * @Date 2019/9/16 15:59
 * @Param
 * @return
 * @Description 测试实体
 **/
public class UserPojo implements Serializable {
    //id
    private int id;
    //用户名
    private String userName;
    //密码
    private String password;
    //年龄
    private int age;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    @Override
    public String toString() {
        return "World[id="+id+",userName="+userName+",password="+password+",age="+age+"]";
    }
 
}