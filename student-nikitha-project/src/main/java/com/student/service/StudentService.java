package com.student.service;

import java.util.List;

import com.student.dto.StudentDto;
import com.student.entity.Student;

public interface StudentService {

	String addStudent(Student student);

	List<StudentDto> getStudentList();

	StudentDto getStudentDetails(Integer studentId);

	List<Student> getStudentDetailsByName(String name);

	Student getStudentDetailsLogin(String loginId, String password);

	String deleteStudentDetails(Integer studentId);

	String upadteStudentName(String name, Integer studentId);

}
