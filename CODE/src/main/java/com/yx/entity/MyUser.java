package com.yx.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/*@Component 这个注解将该类注入到容器当中*/
@Component
@ConfigurationProperties(prefix = "mayikt")
public class MyUser {

    private String name;
    private String age;
    private  String sex;

    public MyUser() {
    }

    public MyUser(String n, String a, String s) {
        //    this.name 代表当前对象   n代表形参
        this.name = n;
        this.age = a;
        this.sex = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

}
