package com.diviso.producerApp;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@EntityListeners(AuditingEntityListener.class)
public class Product {

	
	private @Id @GeneratedValue long id;
	private @Version Long version;
	private @JsonIgnore @LastModifiedDate LocalDateTime lastModifiedDate;
	private long barCode;
	private String productName;
	private String description;
	private double price;
	private float taxPercentage;
	
}
