package com.zyy.day301.bean;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

//加上jsr303校验的注解
public class User implements Serializable{
    @NotEmpty(message = "用户名错误")//判断字符串非空 message属性是错误后提示什么
    private String name;
    @Range(min = 1,max = 100,message = "年龄错误")//字段的范围min最小 max最大
    private int age;
    @Email(message = "邮箱不合法")//校验是否是合法的邮箱地址
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
