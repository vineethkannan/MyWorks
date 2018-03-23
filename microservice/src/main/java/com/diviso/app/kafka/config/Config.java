/**
 * 
 */
package com.diviso.app.kafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.diviso.app.stream.MessageStream;

/**
 * @author vishnu
 *
 */
@EnableBinding(MessageStream.class)
public class Config {
	

}
