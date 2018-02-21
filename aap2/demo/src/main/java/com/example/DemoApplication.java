package com.example;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {
	
	
	public static void main(String[] args) {
	
		SpringApplication.run(DemoApplication.class, args);
		
		
	}
	
}


@Component
@ConfigurationProperties("Configuration")
class Configuration{
	String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;

	}
	
	String password;
	String url;

}

@Component
@ConfigurationProperties("Database")
class Database{
		
		private String email;
		private String place;
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		
	}