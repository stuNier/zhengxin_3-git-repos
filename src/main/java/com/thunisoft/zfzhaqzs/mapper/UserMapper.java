package com.thunisoft.zfzhaqzs.mapper;

import com.thunisoft.zfzhaqzs.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryUser();
}
