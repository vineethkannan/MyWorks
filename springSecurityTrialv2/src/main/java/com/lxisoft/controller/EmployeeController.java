package com.lxisoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lxisoft.data.EmployeeRepo;
import com.lxisoft.model.Employee;
import com.lxisoft.service.EmployeeImplement;

@RestController
public class EmployeeController {
	
	/*@Autowired
	private EmployeeImplement repo;
	
	@RequestMapping("/register")
	public void register(Employee e){
		repo.saveUser(e);
	}*/

}
