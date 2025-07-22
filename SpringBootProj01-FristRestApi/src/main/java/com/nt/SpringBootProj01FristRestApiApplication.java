package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller"})
public class SpringBootProj01FristRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProj01FristRestApiApplication.class, args);
	}

}
