package com.zpark.pojo;

/**
 * @author wuc
 * @date 2019/6/24
 * @description alipay
 */
public class AlipayMessage {
    private Long out_trade_no;
    private String product_code;
    private Float total_amount;
    private String subject;
    private ServiceProvider extend_params;

    public Long getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(Long out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public Float getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Float total_amount) {
        this.total_amount = total_amount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ServiceProvider getExtend_params() {
        return extend_params;
    }

    public void setExtend_params(ServiceProvider extend_params) {
        this.extend_params = extend_params;
    }

    @Override
    public String toString() {
        return "AlipayMessage{" +
                "out_trade_no='" + out_trade_no + '\'' +
                ", product_code='" + product_code + '\'' +
                ", total_amount='" + total_amount + '\'' +
                ", subject='" + subject + '\'' +
                ", extend_params=" + extend_params +
                '}';
    }
}
