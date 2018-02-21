package com.lxisoft.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
	

}
