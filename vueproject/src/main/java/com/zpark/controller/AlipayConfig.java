package com.zpark.controller;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092800618771";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCfTYTTTdDegv0Tw8AQ1/AimmwP9Su5NV/z8XmSmcRaUaVMnDcxVlpD22bfyZbXWpspLFIi04XvRwX/JNq9DhDawnj2lt60ihJ7i4C7GvWaH0ERG90F/9vRkTv9tf0FFo7pyAtCXx/YQ+Dxr+p8YkpViTX0mbBJOpB9D3f2pY4G770pCToclDnvKUsg8BXOZR9EAKdf9GveqbaLAxCRLe3R2OjfkfLSDp4e6xj+U/I0YCI8Sl3SPOazcbnDfc+g1IsdsowsSzStSEWCQw1Xw5YmcnLvhy8P+q1ZK7SV4V87u5BvSsdK/OEIh3Do27TwyOD2ERrbq+rbVQofkvCh4VYxAgMBAAECggEAL6PQGB0KXLDRnGqK8r6RKtgBfxgz1jR3GI3bbJMdnGEUTP/epZuMbQSdFEnGGWsYQczmV1HomPElgvLzk1w0gCduY1glC9rKwjWq7smWL1wvaj1p8NReWaLUTQByxWXEoXdYnqWx8UwDZmPUfRQr5L6e6yJXDN89vJi2qIVEHyBze/lTMhYD4Os5NW2l4nfGxosW0L9EyMuslSJlVmliJV86ffYVGz+Jxbf77onB0IYhZ6FPz7I/Wh0rckn4MZmME5HCRigY0kEdiG7cQBuZ1hc0hAFd2kyTtv90UWIOC4ZyluI44Lxan3G3bZx+VTvs1K24/d69jezL9fU9mRTiEQKBgQDgfBBl3e5ngRM8ZYzNLyHRPtYA28mQ+cwfoNaMcq8uvU0miswXHcOFyKAY+plxwzTTxSslv+013StM35qKC8eJeSq4RKy/qfXrm175is93M4Zzlw0Y9g2GLgc7OnBPn1GiHxulgI5dFg4r72Q89B0ObsTGsfLXtLyfY5Slp2o9PQKBgQC1qtUTk5LKkVAQUShHbpXuXSCMhncXInWf/sksm2IsOoZnz0yJ2qknSiKyFJvJ4qomxfr0FZN0ieHhctGRDzjYqoCD4Cs5scBBt5oL82jlGhFcDmDaROT2iBaz48Ar1912Ox4kPzcMyUJOgWBtoenuSkq5+QFuoKd3OYdOCzD0BQKBgD+S4xH2SA4H/+qa18VEE8+ue+zCUdM86xIJ+rjLwdD6y16e8C2bwEOjDbQFRG9zWQKgVBfcwtD+UcTzjlCKBXhpWC/XQxUEjSCsX7lMFnUromgZ3xuykyHs5x9e7W+fLv860BmOzsKN/HV01m5ss83ikNe0jZGJHeIF0ZMYVn4BAoGAN0VBTJJyb6TkSgKXEZyIixvUQkzKwMQgK0xWIncn2DL6H21HaQ2YtzZr9eglObf3cpJ7dnV2BlfI3FGVht+tuOWu8fBq1kPJLXVRrd8hg8p5i5toRh/91S+0UIizN+OWIll8IyUEd6RnwwDDuLcxN+lscMZcdC72pGRhURJAk40CgYEAxeTa4CICUDX9Fspfx7B2A1IIZnp2y6svzdxhFNwdxxMoHbnEevr+vlDEUHJgwAKZUQUWHu/ZW2zLPTt/FAltbxibQkS/yZGqpjMrpSp4n8ssyP+tTCXhQENwxPbgNW+jgF+DfbSKiJ1+k91alCDigaR0YuxXC46lSIcB7PMC82M=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtHiy5bT6SomN69Q6F85i3ImbXDp/LwPZOH8fVB5IsPk+fECforqu2OduqA4ZT9j1pIkcg+XzLqjTGTUDYRvXrysa+oAuapLR1uKC62ugNyf7xP8S0siKHIwunSkyhWZbvDPTr+C+w0vkHJlp6HUSguF4j5MLbhHh0Pc3d2zWG7BGDCzkP4W3pnLVIbQYyMrlVPQfEPG7I2Syd1h5I+R/DAnMpB4mChA1QuDyKToMkbzhZIhmgTeld0kiG0TkPMxi/AB8UkJ0pOC2jtJ27BZu8w48SGh9cp7aC7ZylpQPFRqeaE+gTLhJO5Gfrl0hUsZoGorkI9GsHXXUuCn4rv2zLQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

