package com.appdev.iam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IamAppDevApplication {

	public static void main(String[] args) {

		SpringApplication.run(IamAppDevApplication.class, args);
	}

	@GetMapping("/secured-1")
	public String sec1(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s! from Role 1\r\n", name);
	}

	@GetMapping("/secured-2")
	public String sec2(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s! from Role 2\rn\n", name);
	}

}
