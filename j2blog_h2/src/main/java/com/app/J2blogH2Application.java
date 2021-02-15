package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//@Configuration, @EnableAutoConfiguration, @ComponentScan

//now setupa a logger from the loggerfactory of slf4j
//also, refer the tel notes of spring boot, form start to end
public class J2blogH2Application {

	public static void main(String[] args) {
		SpringApplication.run(J2blogH2Application.class, args);
	}

}
