package com.wistron.test.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Student implements Serializable {
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;

	private Integer stuId;
	private String stuName;
	private String stuSex;
	// @DateTimeFormat(pattern = "yyyy-MM-dd")
	// @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private String stuTime;

	public Student() {
	}

	public Student(Integer stuId, String stuName, String stuSex, String stuTime) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuTime = stuTime;
	}

}
