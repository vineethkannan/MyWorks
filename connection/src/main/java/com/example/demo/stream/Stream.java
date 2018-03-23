package com.example.demo.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Stream {

	String HRTOPIC="messages-out";
	
	@Output(HRTOPIC)
	public MessageChannel write();
	
	
}
