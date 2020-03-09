package com.imooc.dianping.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ShopModel {
    private Integer id;

    private Date createdAt;

    private Date updatedAt;

    private String name;

    private BigDecimal remarkScore;

    private Integer pricePerMan;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private Integer categoryId;

    private String tags;

    private String startTime;

    private String endTime;

    private String address;

    private Integer sellerId;

    private String iconUrl;

    private CategoryModel categoryModel;

    private SellerModel sellerModel;
}