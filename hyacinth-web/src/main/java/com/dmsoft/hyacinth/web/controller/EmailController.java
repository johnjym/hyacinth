package com.dmsoft.hyacinth.web.controller;

import com.dmsoft.hyacinth.server.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

@Controller
@RequestMapping(value = "/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

//    @RequestMapping("/simple")
//    @ResponseBody
//    public String sendSimpleEmail() {
//        emailService.sendSimpleMail("john.jiang@cygia.com", "你好", "我爱你jym");
//        return "success";
//    }

    @RequestMapping("/attach")
    @ResponseBody
    public String sendAttachmentEmail() {
        //TODO
        File file = new File("E:\\jym\\jym.zip");
        emailService.sendAttachmentMail("john.jiang@cygia.com", "jym", "testjym", file);
        return "success";
    }
}
