package com.imooc.dianping.service;

import com.imooc.dianping.common.CommonRes;
import com.imooc.dianping.model.UserModel;

public interface IUserService {
    UserModel getUser(Integer id);
}
