package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	String addStudent(Student student);

	List<Student> getStudentList();

	Student getStudentDetails(Integer studentId);

	List<Student> getStudentDetailsByName(String name);

	Student getStudentDetailsLogin(String loginId, String password);

}
