package com.dmsoft.hyacinth.web.controller;

import com.dmsoft.hyacinth.server.dto.StaffDto;
import com.dmsoft.hyacinth.server.service.StaffService;
import com.dmsoft.hyacinth.server.utils.CompressUtils;
import com.dmsoft.hyacinth.server.utils.TexttoImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

@Controller
@RequestMapping(value = "/export")
public class ExportController {
    @Autowired
    private StaffService staffService;

    private static String MODEL ="id"+"\t"+"工号"+"\t"+"姓名"+"\t"+"身份证"+"\t\t"+"电话号码"+"\t\t"+"邮箱"+"\r\n";

    @RequestMapping(value = "/totxt")
    @ResponseBody
    public StaffDto findByCode(String code){
        StaffDto staffDto=staffService.findByCode("DM10002");
        String txt = MODEL+staffDto.rString();

        try {

            OutputStreamWriter outputStream  =new OutputStreamWriter(new FileOutputStream("E:/jym/jym.txt"),"utf-8");
            outputStream.write(txt);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return staffDto;
    }

    @RequestMapping(value = "tozip")
    @ResponseBody
    public String ImageToZip(){
        //TODO
        TexttoImage texttoImage = new TexttoImage(new File("E:/jym/jym.txt"), new File("E:/jym/jym.jpg"));
        boolean success = texttoImage.convert();


        CompressUtils compressUtils = new CompressUtils();
        compressUtils.zip("E:/jym/jym.jpg", "E:/jym/jym.zip", true, "123456");
        return "文本转图片：" + (success ? "成功" : "失败");

    }
}
