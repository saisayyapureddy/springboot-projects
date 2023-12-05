package com.springsai.departmentservice.service;

import com.springsai.departmentservice.entity.Department;

public interface DepartmentService {
	public Department saveDepartment(Department department);
	public Department getDepartment(Long dID);

}
