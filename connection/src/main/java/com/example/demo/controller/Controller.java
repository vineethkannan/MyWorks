package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.HrPojo;
import com.example.demo.service.PublishService;

@RestController
public class Controller {

	
private  PublishService publishService;
	
	
	Controller(PublishService publishService) {

		this.publishService = publishService;
	}
	
	@PostMapping("api/hrm")
	public boolean getHrm (@RequestBody HrPojo hrpojo){
		/*HrPojo hrpojo = new HrPojo();
		hrpojo.setName("vineeth");
		*/
		
	
		return publishService.sendMessage(hrpojo);
	}
	
}
