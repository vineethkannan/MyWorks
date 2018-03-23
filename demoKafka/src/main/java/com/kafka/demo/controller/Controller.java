package com.kafka.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.demo.model.HrPojo;
import com.kafka.demo.service.PublishHrm;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Controller {

	private  PublishHrm publishHrm;
	
	
	Controller(PublishHrm publishhrm) {

		this.publishHrm = publishhrm;
	}
	
	@GetMapping("api/hrm")
	public boolean getHrm (){
		HrPojo hrpojo = new HrPojo();
		hrpojo.setName("vineeth");
		hrpojo.setAge("21");
		
		return this.publishHrm.sendMessage(hrpojo);
	}
}
