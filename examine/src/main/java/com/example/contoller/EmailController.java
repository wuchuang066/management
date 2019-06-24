package com.example.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author wuc
 * @date 2019/6/24
 * @description send email
 */
@RestController
@RequestMapping("email")
public class EmailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping("emailSend")
    public Integer emailSend(Integer uid, String toEmail, String username) {
        System.out.println(uid + ":::" + toEmail + ":::" + username);
        MimeMessage message = null;
        try {
            message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            //发送邮箱
            helper.setFrom("hongbaby1214@126.com");
            //目标邮箱
            helper.setTo(toEmail);
            // 设置标题
            helper.setSubject("标题： 找回密码");
            // 设置邮件内容
            String text = "亲 ！ " + username + "  :   恭喜验证成功！ <br/><br/> 点击 <a href='http://localhost:8020/NewProject/updatepwd.html?id=" + uid + "'>修改密码</a> 按钮 进行修改密码！！！";
            helper.setText(text, true);

            javaMailSender.send(message);

        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 1;

    }

}
