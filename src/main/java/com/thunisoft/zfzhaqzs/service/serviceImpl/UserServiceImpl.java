package com.thunisoft.zfzhaqzs.service.serviceImpl;

import com.thunisoft.zfzhaqzs.bean.User;
import com.thunisoft.zfzhaqzs.mapper.UserMapper;
import com.thunisoft.zfzhaqzs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUser(){
        return userMapper.queryUser();
    }
}
