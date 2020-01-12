package com.imooc.dianping.service.impl;

import com.imooc.dianping.dal.UserModelMapper;
import com.imooc.dianping.model.UserModel;
import com.imooc.dianping.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserModelMapper userModelMapper;

    @Override
    public UserModel getUser(Integer id) {
        return userModelMapper.selectByPrimaryKey(id);
    }
}
