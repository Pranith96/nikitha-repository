package com.student.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ExceptionResponse> handleStudentNotFoundExceptiono(StudentNotFoundException ex){
		ExceptionResponse response = new ExceptionResponse();
		response.setDescrition("Data is not found");
		response.setError("Not Found");
		response.setMessage(ex.getMessage());
		response.setStatus(404);
		response.setTimeStamp(LocalDateTime.now());
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
