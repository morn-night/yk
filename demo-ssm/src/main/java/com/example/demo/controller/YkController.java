package com.example.demo.controller;


import com.example.demo.pojo.Page;
import com.example.demo.pojo.Yk;
import com.example.demo.service.YkService;
import com.example.demo.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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
        yk.setImg("ImageUtil.generateBase64(img)");

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
    //分页显示
    @RequestMapping("/allYkss")
    public String listYks(HttpServletRequest request,Model model){
        int startIndex=0;
        int pageSize=5;
        try{
            startIndex = Integer.parseInt(request.getParameter("page.startIndex"));  //从前台获取 开始数据的索引
            pageSize = Integer.parseInt(request.getParameter("page.pageSize"));
        }catch (Exception e){
        }
        Page page = new Page(startIndex,pageSize);
        List<Yk> ykList=ykService.getYksList(startIndex,pageSize);
        int total=ykService.countYk();
        page.setTotal(total);
        model.addAttribute("page",page);
        model.addAttribute("ykList",ykList);
        return "allYkss";
    }


    //删除
    @GetMapping("/del{id}")
    public String delYk(@PathVariable("id") Integer id){
        ykService.deleteById(id);
        System.out.println("删除成功");
        return "redirect:allYks";
    }

    //更新
    @RequestMapping("/to_update_yk")
    public String toUpdateYk(Model model,int id){
        Yk yks=ykService.queryById(id);
        model.addAttribute("yk",yks);
        return "update_yk";
    }

    @RequestMapping("/updateYk")
    public String updateYk(Model model,Yk yk){
        ykService.updateYk(yk);
        Yk yks=ykService.queryById(yk.getId());
        model.addAttribute("yks",yks);
        return "allYks";
    }














}
