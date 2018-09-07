package com.guc.firstdemo.controller;

import com.guc.firstdemo.entity.User;
import com.guc.firstdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/index")
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "name")String name){
        User user = userService.findByUserName(name);
        if(null != user)
            return user.getId()+"\n"+user.getName()+"\n"+user.getPassword();
        else return "未找到此人";
    }

    @RequestMapping(value = "/register")
    @ResponseBody
    public String registerUser(@RequestParam(value = "name")String name,@RequestParam(value = "password")String password,@RequestParam(value = "age",defaultValue = "0",required = false)String age){
        boolean isSuccess = userService.addUser(name,password,age);
        if(isSuccess)
            return "插入成功";
        else return "未找到此人";
    }
}
