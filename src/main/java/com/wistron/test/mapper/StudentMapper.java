package com.wistron.test.mapper;

import java.util.List;

import com.wistron.test.entity.Student;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    Student getStudent(Integer stuId);

    // @Select("select student.* from student")
    List<Student> getStudents();

    int insert(Student student);

    int delStudent(Integer stuId);

    int updateStudent(Student student);
}
