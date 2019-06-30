package com.thunisoft.zfzhaqzs.controller;

import com.thunisoft.zfzhaqzs.bean.User;
import com.thunisoft.zfzhaqzs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public Object test(){
        return userService.getUser().get(0);
    }
}
