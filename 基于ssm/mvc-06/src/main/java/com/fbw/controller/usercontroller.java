package com.fbw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fbw.pojo.user;
import com.fbw.service.userService;

@Controller
@RequestMapping("/user")
public class usercontroller {
	
	@Autowired
	@Qualifier("userServiceImpl")
	private userService us;
	@RequestMapping("/alluser")
	public String list(Model model) {
		List<user> list=us.queryAlluser();
		model.addAttribute("list",list);
		return "alluser";
	}
	@RequestMapping("/toAdduser")
	public String toAddPaper() {
		return "adduser";
	}

	@RequestMapping("/adduser")
	public String addPaper(user user) {
		System.out.println(user);
		us.adduser(user);
		return "redirect:/user/alluser";
	}
	@RequestMapping("toUpdateuser")
	public String toUpdateuser(Model model,int id){
		user users=us.queryuserById(id);
		model.addAttribute("user",users);
		return "updateuser";
	}
	@RequestMapping("/updateuser")
	public String updateuser(Model model,user user){
		us.updateuser(user);
		user users=us.queryuserById(user.getStudent_id());
		model.addAttribute("users",users);
		return "redirect:/user/alluser";
	}
@RequestMapping("/del/{student_id}")
	public String deleteuser(@PathVariable("student_id") int id){
		us.deleteById(id);
		return "redirect:/user/alluser";
}
@RequestMapping("/queryuser")
	public String queryuser(String queryusername,Model model){
	List<user> list=us.queryuser(queryusername);
	if (list.size()==0){
		list=us.queryAlluser();
		model.addAttribute("error","未查到");
	}
	model.addAttribute("list",list);
	return "alluser";
}
}
