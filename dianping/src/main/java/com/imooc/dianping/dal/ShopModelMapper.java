package com.imooc.dianping.dal;

import com.imooc.dianping.model.ShopModel;

import java.util.List;

public interface ShopModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopModel record);

    int insertSelective(ShopModel record);

    ShopModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopModel record);

    int updateByPrimaryKey(ShopModel record);

    List<ShopModel> selectAll();

    Integer countAllShop();
}