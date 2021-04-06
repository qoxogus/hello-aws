package com.helloaws.ec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Ec2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ec2Application.class, args);
	}

}
