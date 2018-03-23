package com.kafka.demo.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.kafka.demo.stream.HrmStream;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@EnableBinding(HrmStream.class)
public class Config {
	
log.info("config"+config.class);
}

