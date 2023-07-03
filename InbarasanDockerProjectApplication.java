package com.example.inbarasan_docker_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InbarasanDockerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(InbarasanDockerProjectApplication.class, args);
	}
	
	@GetMapping("/api")
	public String inba() {
		return "First project for aws using docker";
		
	}

}
