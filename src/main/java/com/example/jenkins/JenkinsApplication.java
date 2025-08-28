package com.example.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {


	Logger logger=LoggerFactory.getLogger(JenkinsApplication.class);
	void printMessage(){
		 logger.info("this is logging message!!");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
		JenkinsApplication jenkinsApplication = new JenkinsApplication();
		jenkinsApplication.printMessage();
	}

}
