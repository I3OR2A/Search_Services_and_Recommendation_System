package com.imooc.dianping.service;

import com.imooc.dianping.common.BusinessException;
import com.imooc.dianping.model.SellerModel;

import java.util.List;

public interface SellerService {

    SellerModel create(SellerModel sellerModel);

    SellerModel get(Integer id);

    List<SellerModel> selectAll();

    SellerModel changeStatus(Integer id, Integer disabledFlag) throws BusinessException;

    Integer countAllSeller();
}