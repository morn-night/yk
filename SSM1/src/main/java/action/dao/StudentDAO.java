package action.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import action.entity.Student;


public interface StudentDAO {
	
	//只要把dao层代码的参数加上@param 才可以,用mybatis传两个参数
	//这是mybatis提供了一个使用注解来传入多个参数的方式、这种方式需要在Mapper接口的参数
	//上添加@param注解,才可以传两个参数
	public Student findByUserNameByPassWord(@Param("username") String username,
			@Param("password") String password);
	public List<Student> findAll();
	
	public Student findById(Integer id);
	
	public int updateById(Student student);
	
	public int saveStudent(Student student);
	
	public int deleteStudent(Integer id);
}
