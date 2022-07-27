package com.fbw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
	private int student_id;
	private String sname;
	private int password;
	private int sex;
	private String note;
	

}
