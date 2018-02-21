package com.lxisoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.lxisoft.data.EmployeeRepo;
import com.lxisoft.model.Employee;

public class EmployeeImplement implements EmployeeService{
	@Autowired
	EmployeeRepo repo;

	@Override
	public void saveUser(Employee e) {
		
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		
		
		e.setPassword(bCryptPasswordEncoder.encode(e.getPassword()));
		repo.save(e);
		
	}

	
	
	
}
