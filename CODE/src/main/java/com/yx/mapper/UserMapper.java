package com.yx.mapper;

import com.yx.entity.User;

/*接口*/
public interface UserMapper {

    //增删改返回的是一个结果值；查询返回的是一个对象

    int insertUser(String name, String sex, Integer age);//可以进行传参

    User selectById();
}
