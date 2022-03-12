package com.yx.controller;

import com.yx.entity.User;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 视图层  通过freemarker模板转发展示前台页面
@Controller
public class Show {

    @RequestMapping("/getShow")
    public String getShow(Map<String, String> result, HttpServletRequest request) {
        result.put("name", "wanghuanbao");
        //request.setAttribute("name", "wanghuanbao");
        /*
         * 转发一个集合展示到前台页面，最好使用map集合传参
         * */
        //ArrayList<User> list = new ArrayList<>();
        //result.put("list",list);

        return "freemarker";
    }
}
