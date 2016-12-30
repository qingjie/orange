package com.qingjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class OrangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeApplication.class, args);
	}
}
