package com.example.demo.controller;


import com.example.demo.pojo.Yk;
import com.example.demo.service.YkService;
import com.example.demo.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


//@RestController
@Controller
@RequestMapping("/yk")
public class YkController {

    @Autowired
    //@Qualifier("ykServiceImpl")
    private YkService ykService;



    @RequestMapping("/to_add_yk")
    public String toAddYk() {
        return "add_yk";
    }

    @PostMapping("/add_yk")
    public String addYk(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("sex") Integer sex,@RequestParam("img") MultipartFile img) {

        Yk yk=new Yk();
        yk.setId(id);
        yk.setName(name);
        yk.setSex(sex);
        yk.setImg(ImageUtil.generateBase64(img));

        System.out.println(yk);
        ykService.addYk(yk);
        return "redirect:allYks";
    }

    @GetMapping(value = "get_base64_img",produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getBase64Img(Integer id){
        Yk yk=ykService.getImgById(id);
        return ImageUtil.decodeBase64Str(yk.getImg());
    }

    @GetMapping(value = "/allYks")
    public String listYk(Model model){

        List<Yk> list=ykService.listYks();
        model.addAttribute("list",list);
        System.out.println(list);
        return "allYks";

    }

    //删除
    @GetMapping("/del{id}")
    public String delYk(@PathVariable("id") Integer id){
        ykService.deleteById(id);
        System.out.println("删除成功");
        return "redirect:allYks";
    }











}
