package com.imooc.dianping.service.impl;

import com.imooc.dianping.DianpingApplication;
import com.imooc.dianping.DianpingApplicationTests;
import com.imooc.dianping.model.UserModel;
import com.imooc.dianping.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

@Slf4j
public class UserServiceImplTest extends DianpingApplicationTests {

    @Autowired
    IUserService userService;

    @Test
    public void getUser() {
        UserModel userModel = userService.getUser(1);
        log.info("user={}", userModel);
    }
}