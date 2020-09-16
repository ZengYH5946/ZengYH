package com.wistron.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wistron.test.entity.RespBean;
import com.wistron.test.entity.Student;
import com.wistron.test.service.StudentService;

@CrossOrigin // 解决跨域问题
@RestController
@RequestMapping("/stu")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/get/{stuId}")
	public RespBean getStudent(@PathVariable Integer stuId) {
		Student student = studentService.getStudent(stuId);
		if (student != null) {
			return RespBean.ok("查询成功", student);
		}
		return RespBean.error("查询失败");
	}

	@RequestMapping("/get")
	public RespBean getStudents() {
		List<Student> list = studentService.getStudents();
		if (list.size() > 0) {
			return RespBean.ok("查询成功", list);
		}
		return RespBean.error("查询失败");
	}

	@PostMapping("/add")
	public RespBean insert(@RequestBody Student student) {//@RequestBody 解析json格式
		// student.setStuId(5);//自增属性
		// student.setStuName("Zorro");
		// student.setStuSex("man");
		// student.setStuTime("19990909");
		System.out.println(student.toString());
		if (studentService.insert(student) == 1) {
			return RespBean.ok("添加成功");
		}
		return RespBean.error("添加失败");
	}

	@RequestMapping("/del/{stuId}")
	public RespBean delStudent(@PathVariable Integer stuId) {
		if (studentService.delStudent(stuId) == 1) {
			return RespBean.ok("刪除成功");
		}
		return RespBean.error("刪除失败");
	}

	@PostMapping("/update")///{stuId}
	public RespBean updateStudent(@RequestBody Student student) {//, @PathVariable Integer stuId
		// student.setStuId(stuId);
		// student.setStuName("ZengYH");
		// student.setStuSex("man");
		// student.setStuTime("2020.02.02");
		if (studentService.updateStudent(student) == 1) {
			return RespBean.ok("修改成功");
		}
		return RespBean.error("修改失败");
	}
}
