package com.yx.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration  //这个注解将这个类注入到SpringMVC容器中
@ComponentScan("com.yx.controller.test")           //这个注解是扫包，可以访问同一个包下所有不同类的接口
public class HelloWorld {
    @RequestMapping("/getUser")
    public String getUser() {
        return "哈哈哈！！！";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class,args);  //启动类的入口
    }

}
