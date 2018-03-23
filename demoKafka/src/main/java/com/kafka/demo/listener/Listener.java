package com.kafka.demo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.kafka.demo.model.HrPojo;
import com.kafka.demo.service.PublishHrm;
import com.kafka.demo.stream.HrmStream;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Listener {
	private final Logger log = LoggerFactory.getLogger(Listener.class);
	@StreamListener(HrmStream.HROUT)
	public void listenToMessage(@Payload HrPojo hrpojo) {
		log.info("get hrpojo");
	}
	
}
