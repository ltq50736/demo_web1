package com.cykj.demo_web.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//@FeignClient(name = "CLIENT-NAME") //aplication name
@FeignClient(name = "CLIENT-NAME",fallback = UserDaoFeignFallBack.class) //aplication name
public interface UserDaoFeign { //封装了RestTemplate，
    @RequestMapping(value = "userControl/loginJsp") //消费提供者的跳转路径
    public  String getUserInfo(@RequestParam("account")String account,@RequestParam("password")String password );
}
