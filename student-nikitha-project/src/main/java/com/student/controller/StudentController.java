package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentDto;
import com.student.entity.Student;
import com.student.service.StudentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/save")
	@ApiOperation(value = "Student account Creation API",
    notes = "Please provide all the info for Student account creation",
    response = Student.class)
	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		String response = studentService.addStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/get-all")
	@ApiOperation(value = "All Student details fetch API",
    notes = "Get all students details api",
    response = Student.class)
	public ResponseEntity<List<StudentDto>> getAllStudents() {
		List<StudentDto> response = studentService.getStudentList();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/{studentId}")
	@ApiOperation(value = "Get Student details from id API",
    notes = "Get students details api",
    response = Student.class)
	public ResponseEntity<StudentDto> getStudentDetails(@PathVariable("studentId") Integer studentId) {
		StudentDto response = studentService.getStudentDetails(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/id")
	public ResponseEntity<StudentDto> getStudentDetailsById(@RequestParam("studentId") Integer studentId) {
		StudentDto response = studentService.getStudentDetails(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/name/{name}")
	public ResponseEntity<List<Student>> getStudentDetailsByName(@PathVariable("name") String name) {
		List<Student> response = studentService.getStudentDetailsByName(name);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/details/{loginId}/{password}")
	public ResponseEntity<Student> getStudentDetailsLogin(@PathVariable("loginId") String loginId,
			@PathVariable("password") String password) {
		Student response = studentService.getStudentDetailsLogin(loginId, password);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<String> deleteStudentDetails(@PathVariable("studentId") Integer studentId) {
		String response = studentService.deleteStudentDetails(studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/update/{name}/{studentId}")
	public ResponseEntity<String> updateStudentName(@PathVariable("name") String name,
			@PathVariable("studentId") Integer studentId) {
		String response = studentService.upadteStudentName(name, studentId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
