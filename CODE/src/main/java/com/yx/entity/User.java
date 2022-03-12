package com.yx.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import sun.rmi.runtime.Log;

/*
* 引入lombok依赖包，@Data  这个注解可以提供get和set方法
*
* @Slf4j  打印日志
* */
@Data
@Slf4j
public class User {

    private  String name;
    private  Integer age;
    private  String sex;

    public static void main(String[] args) {
        User user = new User();
        /*打印日志*/
        log.info("whb");


    }
}
