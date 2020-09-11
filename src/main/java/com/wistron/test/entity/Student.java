package com.wistron.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Student {
	private Integer stuId;
	private String stuName;
	private String stuSex;
	@DateTimeFormat(pattern = "yyyy-MM-dd") // 时间格式转换
	@JsonFormat(pattern = "yyyy-MM-dd") // 时间格式转换
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
