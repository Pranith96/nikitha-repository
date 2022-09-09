package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Status;
import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String addStudent(Student student) {
		student.setStatus(Status.ACTIVE);
		Student response = studentRepository.save(student);
		if (response == null) {
			return "data is not saved";
		}
		return "data is saved successfully";
	}

	@Override
	public List<Student> getStudentList() {
		List<Student> response = studentRepository.findAll();
		if (response == null || response.isEmpty()) {
			throw new RuntimeException("Data is empty");
		}
		return response;
	}

	@Override
	public Student getStudentDetails(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is not found for id");

		}
		return response.get();
	}

	@Override
	public List<Student> getStudentDetailsByName(String name) {
		List<Student> response = studentRepository.findByName(name);
		if (response.isEmpty() || response == null) {
			throw new RuntimeException("Data is not found for name");
		}
		return response;
	}

	@Override
	public Student getStudentDetailsLogin(String loginId, String password) {
		Optional<Student> response = studentRepository.findByLoginAndPassword(loginId, password);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is not found for login id and password");
		}
		return response.get();
	}
}