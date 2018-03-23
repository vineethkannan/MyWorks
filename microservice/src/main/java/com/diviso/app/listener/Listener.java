/**
 * 
 */
package com.diviso.app.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.diviso.app.service.CustomerService;
import com.diviso.app.service.dto.CustomerDTO;
import com.diviso.app.stream.MessageStream;
import com.diviso.app.web.rest.CustomerResource;

/**
 * @author vishnu
 *
 */
@Component
public class Listener {
	
	private final CustomerService customerService;
	
	private final Logger log = LoggerFactory.getLogger(Listener.class);
	
	public Listener(CustomerService customerService) {
		
		this.customerService = customerService;
	}
	
	@StreamListener(MessageStream.OUT_IN)
	public void listenToMessage(@Payload CustomerDTO customerDTO) {
		log.info("listener listen");
		
		customerService.save(customerDTO);

	}
	

}
