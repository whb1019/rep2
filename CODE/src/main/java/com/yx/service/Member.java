package com.yx.service;

import com.yx.entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Member {
    @Autowired  //将对象注入到容器中
    private MyUser myUser;
    // 获取配置文件yml里边的信息，如果取配置文件中的一个key，可以使用@value注解
     @Value("${mayikt.name}")
    private String Name;
    @Value("${mayikt.age}")
    private  int age;

    /*使用@value注解获取到配置文件的信息*/
    @RequestMapping("/getMember")
    public String getMember(){
        return Name+"---"+age;

    }

    /*使用在实体类上加入@Component
       @ConfigurationProperties(prefix = "mayikt")  实现获取配置文件信息*/
    @RequestMapping("/getMyUser")
    public  String getMyUser(){

        return myUser.toString();

    }

    /*开启异步线程，注意启动类上加上@EnableAsync注解，方法上加上@Async，还需要专门写一个线程池配置类*/

    @RequestMapping("/addMember")
    //@Async
    public String addMember(){

        return "注册成功";
    }

    /*验证异常*/
    @RequestMapping("/addResult")
    public int  addResult(int number){
        int j=1/number;
        return j;
    }
}
