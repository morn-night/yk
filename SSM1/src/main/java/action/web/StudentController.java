package action.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import action.entity.Student;
import action.service.StudentService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	//用ModelAndView转到login.html(登录界面)
	@RequestMapping("toLogin")
	public ModelAndView toLogin() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	
	//登录方法
	@RequestMapping("login")
	@ResponseBody
	public JSONObject login(@RequestParam(defaultValue="username",required=false)String username,
			@RequestParam(defaultValue="password",required=false)String password,
			HttpServletRequest request){
		Student student=studentService.checkLogin(username, password);
		//if(student!=null){
			JSONObject student_json = JSONObject.fromObject(student);
			System.out.println("student_json="+student_json);
			return  student_json;
		//}
		//return null;
	}
		
	//显示所有数据
	@RequestMapping("list")
	@ResponseBody
	public JSONArray list(){
		List<Student> list=studentService.findAll();
		JSONArray json=JSONArray.fromObject(list);
		return json;
	}
	
	
	//修改数据
	@RequestMapping("update")
	@ResponseBody
	public String update(@RequestParam Map<Object,Object> map){
		//Object转Integer类型
		Integer id = Integer.parseInt(map.get("id").toString());
		System.out.println("id="+id);
		Student student=studentService.findById(id);
		String name=String.valueOf(map.get("name"));
		String username=String.valueOf(map.get("username"));
		String password=String.valueOf(map.get("password"));
		String sex=String.valueOf(map.get("sex"));
		String classname=String.valueOf(map.get("classname"));
		Integer chinese=Integer.parseInt(map.get("chinese").toString());
		Integer english=Integer.parseInt(map.get("english").toString());
		Integer math=Integer.parseInt(map.get("math").toString());
		//给student赋值
		student.setName(name);
		student.setUsername(username);
		student.setPassword(password);
		student.setSex(sex);
		student.setClassname(classname);
		student.setChinese(chinese);
		student.setEnglish(english);
		student.setMath(math);
		int num=studentService.updateById(student);
		return String.valueOf(num);
	}
	
	
	//添加数据
	@RequestMapping("saveStudent")
	@ResponseBody
	public String saveStudent(@RequestParam Map<Object,Object> map){
		//用map接收值
		String name=String.valueOf(map.get("name"));
		String username=String.valueOf(map.get("username"));
		String password=String.valueOf(map.get("password"));
		String sex=String.valueOf(map.get("sex"));
		String classname=String.valueOf(map.get("classname"));
		Integer chinese=Integer.parseInt(map.get("chinese").toString());
		Integer english=Integer.parseInt(map.get("english").toString());
		Integer math=Integer.parseInt(map.get("math").toString());
		//给student赋值
		Student student=new Student();
		student.setName(name);
		student.setUsername(username);
		student.setPassword(password);
		student.setSex(sex);
		student.setClassname(classname);
		student.setChinese(chinese);
		student.setEnglish(english);
		student.setMath(math);
		int num=studentService.saveStudent(student);
		return String.valueOf(num);
	}
	
	
	//删除数据
	@RequestMapping("deleteStudent")
	@ResponseBody
	public String deleteStudent(@RequestParam(defaultValue="id",required=false)Integer id){
		int num=studentService.deleteStudent(id);
		return String.valueOf(num);
	}
	
	
}
