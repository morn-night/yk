package com.fbw.service;

import java.util.List;

import com.fbw.pojo.user;

public interface userService {
	//增加用户
	int adduser(user users);
	//查询全部用户
	List<user> queryAlluser();
	//删除用户
	int deleteById(int id);
	//修改用户信息
	int updateuser(user user);
	//根据id来查找一个book，这个主要是用来修改用户的信息的
	user queryuserById(int id);
	//根据用户名来查
	List<user> queryuser(String sname);
}
