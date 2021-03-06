package com.cykj.demo_web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public String getUserInfo(String account,String password){
        return restTemplate.getForObject("http://CLIENT-NAME/userControl/loginJsp",String.class);
    }
}

