package com.example.demo.service;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.example.demo.pojo.HrPojo;
import com.example.demo.stream.Stream;

@Service
public class PublishService {

public final Stream	stream;
	
	//log.info("Stream"+PublishHrm);
	
public PublishService(Stream stream) {
		this.stream=stream;
		
	}
	public boolean sendMessage(HrPojo pojo) {
		
		
		
		MessageChannel messagechanel= this. stream .write();
			
		boolean message = messagechanel.send(MessageBuilder.withPayload(pojo)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
				) ;
		return message;
		
	}
	
	
	
}
