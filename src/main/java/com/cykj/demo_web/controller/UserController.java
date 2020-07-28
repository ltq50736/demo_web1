package com.cykj.demo_web.controller;

import com.cykj.demo_web.service.UserDaoFeign;
import com.cykj.demo_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDaoFeign userDaoFeign;


    @RequestMapping("getUserInfo1")
    public String getUserInfo1(String account,String password)
    {
        System.out.println("服务调用者dome_web"+account);
        return userDaoFeign.getUserInfo(account,password);
    }




    @RequestMapping("getUserInfo")
    public String getUserInfo(String account,String password)
    {
        System.out.println("服务调用者dome_web"+account);
        return userService.getUserInfo(account,password);
    }
}