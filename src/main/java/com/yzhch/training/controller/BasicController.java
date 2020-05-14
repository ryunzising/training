package com.yzhch.training.controller;

import com.yzhch.training.POJO.User;
import com.yzhch.training.excution.Msg;
import com.yzhch.training.redis.RedisService;
import com.yzhch.training.redis.UserKey;
import com.yzhch.training.service.UserService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
 *@author yzhch
 *@data 2020/5/14 10:12
 */
@RestController
public class BasicController {
    @Resource
    UserService userService;
    RedisService redisService;
    @RequestMapping("/demo")
    public String demo(Model model){
        model.addAttribute("name","leon");
        return "hello";
    }
    @RequestMapping("/getById")
    public Msg get(){
        User user=userService.getById(1);
        return Msg.success().add("user",user);
    }
    @RequestMapping("/redisget")
    public Msg redisGet(){
        User user=redisService.get(UserKey.getById,""+1,User.class);
        return Msg.success().add("v1",user);
    }
    @RequestMapping("/redisset")
    public Msg redisSet(){
        User user=new User();
        user.setId(1);
        user.setName("aaa");
        redisService.set(UserKey.getById,""+1,user);
        return Msg.success();
    }
}
