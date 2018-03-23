package com.example.demo.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.example.demo.stream.Stream;

@EnableBinding(Stream.class)
public class config {

}
