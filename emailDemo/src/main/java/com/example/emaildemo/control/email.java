package com.example.emaildemo.control;

import org.junit.Test;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.util.Properties;

public class email {
    @Test
    public void test() {
        try {
            this.sendEmail("testPerson","602324362@qq.com","测试邮件","嘿嘿");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void sendEmail(String personal,String toAddress,String title,String data) throws MessagingException, IOException {
        // 创建Properties 类用于记录邮箱的一些属性
        Properties props = new Properties();
        InputStream inputStream = email.class.getClassLoader().getResourceAsStream("emailConfig.properties");
        props.load(inputStream);
        // 构建授权信息，用于进行SMTP进行身份验证
        Authenticator authenticator = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                // 用户名、密码
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        // 使用环境属性和授权信息，创建邮件会话
        Session mailSession = Session.getInstance(props, authenticator);

        // 创建邮件消息
        MimeMessage message = new MimeMessage(mailSession);

        // 设置发件人
        InternetAddress form = new InternetAddress(props.getProperty("mail.user"),personal);
        message.setFrom(form);

        // 设置收件人的邮箱
        InternetAddress to = new InternetAddress(toAddress);
        message.setRecipient(Message.RecipientType.TO, to);

        // 设置邮件标题
        message.setSubject(title);

        // 设置邮件的内容体
        message.setContent(data, "text/html;charset=UTF-8");

        // 发送邮件
        Transport.send(message);

    }



}
