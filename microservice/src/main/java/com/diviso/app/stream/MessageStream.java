/**
 * 
 */
package com.diviso.app.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


public interface MessageStream {
	static final String OUT_IN = "CreateCustomer";
	
	
	@Input(OUT_IN)
	public SubscribableChannel read();
}
