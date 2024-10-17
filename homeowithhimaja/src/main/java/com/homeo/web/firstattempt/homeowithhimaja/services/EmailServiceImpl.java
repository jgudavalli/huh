package com.homeo.web.firstattempt.homeowithhimaja.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.homeo.web.firstattempt.homeowithhimaja.beans.MailConfiguration;

@Component
public class EmailServiceImpl {

    @Autowired
    private MailConfiguration emailSender;

    public void sendSimpleMessage(
      String from, String fullname, String mobile,String msg) {
       // ...
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom(from);
        message.setTo("jgudavalli@gmail.com"); 
        message.setSubject(fullname); 
        message.setText(msg);
        emailSender.getJavaMailSender().send(message);
       // ...
    }
}