package com.cykj.demo_web.service;

import org.springframework.stereotype.Component;

@Component
public class UserDaoFeignFallBack implements UserDaoFeign {

    @Override
    public String getUserInfo(String account, String password) {
        return "登陆失败";
    }
}
