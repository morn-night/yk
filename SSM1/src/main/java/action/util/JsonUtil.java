package action.util;

import action.entity.Student;

public class JsonUtil {
	
	public static String getJson(Student student){
		String str=student.getId()+","+student.getName()+","+student.getUsername()
			+student.getPassword()+","+student.getClass()+","
			+student.getChinese()+","+student.getEnglish()+","+student.getMath();
		return String.valueOf(str);
		
	}
	
}
