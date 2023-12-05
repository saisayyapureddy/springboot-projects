package com.springsai.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsai.departmentservice.entity.Department;
import com.springsai.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		log.info("inside saveDepartment of DepartmentServiceImpl"+department );
		return departmentRepository.save(department);
	}

	@Override
	public Department getDepartment(Long dID) {
		log.info("inside getDepartment of DepartmentServiceImpl" );
		return departmentRepository.findById(dID).get();
	}

}

