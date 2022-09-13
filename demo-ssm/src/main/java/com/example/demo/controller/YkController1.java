package com.example.demo.controller;

import com.example.demo.pojo.Yk;
import com.example.demo.service.YkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("/yk1")
@CrossOrigin
public class YkController1 {

    @Autowired
    private YkService ykService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Yk> list(){
        return ykService.listYks();
    }




}
