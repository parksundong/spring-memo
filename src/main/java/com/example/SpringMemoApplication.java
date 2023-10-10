package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //추가
@SpringBootApplication
public class SpringMemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringMemoApplication.class, args);
	}

	@GetMapping(value = "/")		//추가
	public String HelloWorld(){		//추가
		return "Hello World";		//추가
	}
}
