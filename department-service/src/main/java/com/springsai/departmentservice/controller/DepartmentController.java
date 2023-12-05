package com.springsai.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsai.departmentservice.entity.Department;
import com.springsai.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
		Department department1 = departmentService.saveDepartment(department);
		log.info("inside saveDepartment of DepartmentController"+department1 );
		return new ResponseEntity<Department>(department1, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department> getDepartment(@PathVariable("id") Long departmentId )
	{
		Department department = departmentService.getDepartment(departmentId);
		log.info("inside getDepartment of DepartmentController"+department );
		return new ResponseEntity<Department>(department, HttpStatus.OK);
	}

}
