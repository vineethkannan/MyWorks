package com.kafka.demo.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

import com.kafka.demo.model.HrPojo;
import com.kafka.demo.service.PublishHrm;

import lombok.extern.slf4j.Slf4j;



public interface HrmStream {

//	String HRIIN="in";
	
	String HROUT=" messages-in";
	
//	@Input(HRIIN)
//	public SubscribableChannel read();
	
	
	@Output(HROUT)
	public MessageChannel write();



	
	
	
}
