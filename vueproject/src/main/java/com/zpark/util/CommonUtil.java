package com.zpark.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author wuc
 * @date 2019/6/24
 * @description utils
 */
public class CommonUtil {
    /**
     * 功能描述：生成19 位订单号
     * @author wuc
     * @date 2019/6/24
     * @param
     * @return java.lang.String
     */
    public static String getOrderNo() {
        String orderNo = "";
        UUID uuid = UUID.randomUUID();
        String trandNo = String.valueOf((Math.random() * 9 + 1) * 1000000);
        String sdf = new SimpleDateFormat("yyyyMMddHHMMSS").format(new Date());
        orderNo = uuid.toString().substring(0, 8);
        orderNo = orderNo + sdf;
        return orderNo;
    }
}
