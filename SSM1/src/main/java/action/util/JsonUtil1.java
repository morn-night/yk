package action.util;

import java.util.HashMap;
import java.util.Map;

import action.entity.Student;

public class JsonUtil1 {
	
	public static String getJson(Student student){
		
		
		
		return "{"+"id"+":"+student.getId()+","
			+"name"+":"+student.getName()+","
			+"username"+":"+student.getUsername()+","
			+"password"+":"+student.getPassword()+","
			+"class"+":"+student.getClass()+","
			+"chinese"+":"+student.getChinese()+","
			+"english"+":"+student.getEnglish()+","
			+"math"+":"+student.getMath()+"}";
		//return String.valueOf(str);
		
	}
	
}
