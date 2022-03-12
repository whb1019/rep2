package com.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.xml.ws.soap.MTOM;


/*
*  SpringBootApplication 相当于ComponentScan， EnableAutoConfiguration这俩包的组合注解
*   扫描范围：同级包下面的所有子包，这样，所有接口都能访问
*
* @MapperScan(com.yx.mapper)  在有接口时，需要在启动类上加上这个注解，扫包
* */
//@EnableScheduling  开始定时任务;@EnableAsync 开启异步线程
//@EnableAsync
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);

    }
}
