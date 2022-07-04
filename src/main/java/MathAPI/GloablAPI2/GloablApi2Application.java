package MathAPI.GloablAPI2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class GloablApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(GloablApi2Application.class, args);
	}

	// http://localhost:8080/test
	@RequestMapping("/String")
	String WhatIsAString()
	{
		return "Clarke's new API test running on server";
	}

	// http://localhost:8080/test
	@RequestMapping("/Number")
	String giveMeANumber()
	{
		return "5";
	}
}