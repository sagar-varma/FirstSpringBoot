package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "Hello World - Changed to Index";
	}

	@GetMapping("/feature")
	public String feature(){
		return "Hello Feauture Branch";
	}

	@GetMapping("/AnotherFeature")
	public String AnotherFeature(){
		return "Hello Another Feature";
	}

}
