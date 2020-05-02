package com.certimeter.learnsoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({
	"com.certimeter.learnsoap.configuration", 
	"com.certimeter.learnsoap.soap.client" 	
})
@SpringBootApplication
public class LearnsoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnsoapApplication.class, args);
	}

}
