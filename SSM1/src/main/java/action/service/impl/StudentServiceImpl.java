package action.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import action.dao.StudentDAO;
import action.entity.Student;
import action.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentdao;
	
	public Student checkLogin(String userName, String passWord) {
		Student student=studentdao.findByUserNameByPassWord(userName, passWord);
		return student;
	}

	public List<Student> findAll() {
		List<Student> list=studentdao.findAll();
		return list;
	}

	public Student findById(Integer id) {
		Student student=studentdao.findById(id);
		return student;
	}

	public int updateById(Student student) {
		int num=studentdao.updateById(student);
		return num;
	}

	public int saveStudent(Student student) {
		int num=studentdao.saveStudent(student);
		return num;
	}

	public int deleteStudent(Integer id) {
		int num=studentdao.deleteStudent(id);
		return num;
	}

	

}
