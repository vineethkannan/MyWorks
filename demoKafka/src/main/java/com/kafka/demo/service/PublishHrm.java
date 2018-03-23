package com.kafka.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.kafka.demo.model.HrPojo;
import com.kafka.demo.stream.HrmStream;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class PublishHrm {
	
	public final HrmStream	hrmStream;
	
	log.info("PublishHrm"+PublishHrm);
	
	PublishHrm(HrmStream hrmStream) {
		this.hrmStream=hrmStream;
		
	}
	public boolean sendMessage(HrPojo pojo) {
		
		log.info("sendMessage");
		
		MessageChannel messagechanel= this. hrmStream .write();
			
		boolean message = messagechanel.send(
				MessageBuilder.withPayload(pojo)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
				) ;
		return message;
		
	}
	

	
}
