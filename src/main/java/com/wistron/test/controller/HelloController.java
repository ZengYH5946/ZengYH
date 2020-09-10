package com.wistron.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wistron.test.entity.Student;
import com.wistron.test.service.StudentService;

@CrossOrigin // 解决跨域问题
@RestController
public class HelloController {

    @Autowired
    private StudentService studentService;

	@RequestMapping("/hello")
	public Map<String, Student> hello() {
		Map<String, Student> map = new HashMap<>();
		Student stu = new Student(0, "ZengYH", "男");
		Student stu2 = new Student(1, "ZengYH_Zorro", "男");
		map.put("0", stu);
		map.put("1", stu2);
		return map;
	}

	@RequestMapping("/haha")
	public List<Student> haha() {
		return studentService.getStudents();
	}

	@RequestMapping("/zzz")
	public Map<String, Object> zzz() {
		Map<String, Object> map = new HashMap<>();
		List<Student> list = new ArrayList<>();
		Student stu = new Student(0, "zorro", "男");
		list.add(0, stu);
		list.add(1, stu);
		map.put("test", list);
		return map;
	}
}
