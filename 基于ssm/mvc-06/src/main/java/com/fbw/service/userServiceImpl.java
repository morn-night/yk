package com.fbw.service;

import java.util.List;

import com.fbw.dao.usermapper;
import com.fbw.pojo.user;

public class userServiceImpl implements userService {
	
	private usermapper usermapper;

	public usermapper getUsermapper() {
		return usermapper;
	}

	public void setUsermapper(usermapper usermapper) {
		this.usermapper = usermapper;
	}

	@Override
	public int adduser(user users) {
		// TODO Auto-generated method stub
		return usermapper.adduser(users);
	}

	@Override
	public List<user> queryAlluser() {
		// TODO Auto-generated method stub
		return usermapper.queryAlluser();
	}

	@Override
	public int deleteById(int id) {
		return usermapper.deleteById(id);
	}

	@Override
	public int updateuser(user user) {

		return usermapper.updateuser(user);
	}

	@Override
	public user queryuserById(int id) {
		return usermapper.queryuserById(id);
	}

	@Override
	public List<user> queryuser(String sname) {
		return usermapper.queryuser(sname);
	}

}
