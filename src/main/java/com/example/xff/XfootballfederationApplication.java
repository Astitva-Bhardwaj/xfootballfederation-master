package com.example.xff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.xff.model")
public class XfootballfederationApplication {

	public static void main(String[] args) {
		SpringApplication.run(XfootballfederationApplication.class, args);
	}

}
