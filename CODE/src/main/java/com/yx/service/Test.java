package com.yx.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Test {
    @RequestMapping("/getMom")
    public String getMom(){
        return "获取新的成员33，好厉害了！";
    }




}
