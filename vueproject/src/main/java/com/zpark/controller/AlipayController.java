package com.zpark.controller;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.zpark.pojo.AlipayMessage;
import com.zpark.pojo.ServiceProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wuc
 * @date 2019/6/24
 * @description 支付宝在线网站支付
 */
@RestController
public class AlipayController {
    @RequestMapping("common")
    public void doPost(HttpServletRequest httpRequest,
                       HttpServletResponse httpResponse, Float amount, String orderMessage) throws ServletException, IOException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do", AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type); //获得初始化的AlipayClient
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();//创建API对应的request
        alipayRequest.setReturnUrl("http://localhost:8080");
        alipayRequest.setNotifyUrl("http://domain.com/CallBack/notify_url.jsp");//在公共参数中设置回跳和通知地址
        AlipayMessage alipayMessage = new AlipayMessage();
        alipayMessage.setOut_trade_no(System.currentTimeMillis());
        alipayMessage.setProduct_code("FAST_INSTANT_TRADE_PAY");
        alipayMessage.setTotal_amount(amount);
        alipayMessage.setSubject(orderMessage);
        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.setSys_service_provider_id("2088511833207846");
        alipayMessage.setExtend_params(serviceProvider);
        String bizContent =JSONObject.toJSONString(alipayMessage);
        System.out.println("alipayMessage:  "+bizContent);
        alipayRequest.setBizContent(bizContent);//填充业务参数
        String form = "";
        try {
            System.out.println(alipayClient.pageExecute(alipayRequest));
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        httpResponse.setContentType("text/html;charset=" + AlipayConfig.charset);
        httpResponse.getWriter().write(form);//直接将完整的表单html输出到页面
        httpResponse.getWriter().flush();
        httpResponse.getWriter().close();
    }
}
