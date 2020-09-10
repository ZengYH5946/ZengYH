package com.wistron.test.service;

import java.util.List;

import com.wistron.test.entity.Student;

public interface StudentService {
    Student getStudent(Integer id);

    List<Student> getStudents();
    
    int insert(Student student);

}