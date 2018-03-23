package com.example.demo.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import com.example.demo.pojo.HrPojo;
import com.example.demo.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j

@Component
public class Listener {

	
	
	@StreamListener(Stream.HRTOPIC)
	public void subscribeMessage(@Payload HrPojo hrpojo) {
		log.info("message"+hrpojo);
	}
}
