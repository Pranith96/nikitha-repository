package com.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dto.StudentDto;
import com.student.entity.Status;
import com.student.entity.Student;
import com.student.exceptions.StudentNotFoundException;
import com.student.repository.StudentRepository;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public String addStudent(Student student) {
		student.setStatus(Status.ACTIVE);
		student.getAddress().setStudent(student);
		Student response = studentRepository.save(student);
		if (response == null) {
			return "data is not saved";
		}
		return "data is saved successfully";
	}

	@Override
	public List<StudentDto> getStudentList() {
		List<Student> response = studentRepository.findAll();
		List<StudentDto> list = new ArrayList<>();
		if (response == null || response.isEmpty()) {
			throw new StudentNotFoundException("Data is empty");
		}

		for (Student student : response) { // 3
			StudentDto dto = new StudentDto();
			dto.setEmail(student.getEmail());
			dto.setMobileNumber(student.getMobileNumber());
			dto.setName(student.getName());
			dto.setStatus(student.getStatus());
			list.add(dto);
		}

		return list;
	}

	@Override
	public StudentDto getStudentDetails(Integer studentId) {
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new StudentNotFoundException("Data is not found for id");

		}
		StudentDto dto = new StudentDto();
		dto.setEmail(response.get().getEmail());
		dto.setMobileNumber(response.get().getMobileNumber());
		dto.setName(response.get().getName());
		dto.setStatus(response.get().getStatus());
		return dto;
	}

	@Override
	public List<Student> getStudentDetailsByName(String name) {
		// List<Student> response = studentRepository.findByName(name);
		List<Student> response = studentRepository.getByName(name);
		if (response.isEmpty() || response == null) {
			throw new StudentNotFoundException("Data is not found for name");
		}
		return response;
	}

	@Override
	public Student getStudentDetailsLogin(String loginId, String password) {
		// Optional<Student> response =
		// studentRepository.findByLoginAndPassword(loginId, password);
		Optional<Student> response = studentRepository.getByLoginAndPassword(loginId, password);
		if (!response.isPresent()) {
			throw new StudentNotFoundException("Data is not found for login id and password");
		}
		return response.get();
	}

	@Override
	public String deleteStudentDetails(Integer studentId) {
		studentRepository.deleteById(studentId);
		// Student response = getStudentDetails(studentId);
		// studentRepository.delete(response);
		return "deleted successfully";
	}

	@Transactional
	@Override
	public String upadteStudentName(String name, Integer studentId) {
		studentRepository.updateNameById(name, studentId);
/*
		Optional<Student> response = studentRepository.findById(studentId);
		if (!response.isPresent()) {
			throw new RuntimeException("Data is not found for id");
		}
		if (name != null) {
			if (!name.isEmpty()) {
				response.get().setStatus(Status.INACTIVE);
			}
		}
		studentRepository.save(response.get());
*/
		return "updated successfully";
	}
}
