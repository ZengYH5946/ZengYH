package com.wistron.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wistron.test.entity.Student;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public Map<String, Student> hello() {
		Map<String, Student> map = new HashMap<String, Student>();
		Student stu = new Student(0, "zorro", "男");
		map.put("1", stu);
		map.put("2", stu);
		return map;
	}
	
	@RequestMapping("/haha")
	public List<Student> haha() {
		List<Student> list = new ArrayList<Student>();
		Student stu = new Student(0, "zorro", "男");
		list.add(0, stu);
		list.add(1, stu);
		return list;
	}
}
