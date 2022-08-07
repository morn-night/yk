package action.service;

import java.util.List;

import action.entity.Student;

public interface StudentService {
	
	public Student checkLogin(String username,String password);
	
	public List<Student> findAll();
	
	public Student findById(Integer id); 
	
	public int updateById(Student student);
	
	public int saveStudent(Student student);
	
	public int deleteStudent(Integer id);
}
