package com.ingresskubernetes.ingress.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingresskubernetes.ingress.Entity.Student;

@RestController
@RequestMapping
public class StrudentController {
	
	
	
	
	@GetMapping("/student")
	public ResponseEntity<Student> getstudent()
	{
		Student student = new Student("Akram","A");
		return ResponseEntity.ok(student);
		
		
	}
	
	
	

}
