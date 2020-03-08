package com.imooc.dianping.service.impl;


import com.imooc.dianping.common.BusinessException;
import com.imooc.dianping.common.EmBusinessError;
import com.imooc.dianping.dal.SellerModelMapper;
import com.imooc.dianping.model.SellerModel;
import com.imooc.dianping.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerModelMapper sellerModelMapper;


    @Override
    public SellerModel create(SellerModel sellerModel) {
        return null;
    }

    @Override
    public SellerModel get(Integer id) {
        return null;
    }

    @Override
    public List<SellerModel> selectAll() {
        return sellerModelMapper.selectAll();
    }

    @Override
    public SellerModel changeStatus(Integer id, Integer disabledFlag) throws BusinessException {
        return null;
    }
}