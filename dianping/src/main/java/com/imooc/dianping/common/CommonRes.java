package com.imooc.dianping.common;

import lombok.Data;

@Data
public class CommonRes {

    public static final String COMMON_RES_SUCCESS = "success";

    public static final String COMMON_RES_FAIL = "fail";

    //表明读经请求的返回处理结果，"success"或"fail"
    private String status;

    //若status=success时，表明对应的返回的json类数据
    //若status=fail时，则data内将使用通用的错误码对应的格式
    private Object data;

    //定义一个通用的创建返回对象的方法
    public static CommonRes create(Object result) {
        return CommonRes.create(result, COMMON_RES_SUCCESS);
    }

    public static CommonRes create(Object data, String status) {
        CommonRes commonRes = new CommonRes();
        commonRes.setStatus(status);
        commonRes.setData(data);

        return commonRes;
    }
}
