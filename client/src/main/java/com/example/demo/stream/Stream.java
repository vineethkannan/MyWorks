package com.example.demo.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Stream {
String HRTOPIC="messages-in";
	
	@Input(HRTOPIC)
	public SubscribableChannel read();
	
}
