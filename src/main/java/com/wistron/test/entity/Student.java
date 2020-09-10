package com.wistron.test.entity;

import lombok.Data;

@Data
public class Student {
    private Integer id;
	private String name;
	private String sex;
	
	public Student() {
		super();
	}
	
	public Student(Integer id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

}
