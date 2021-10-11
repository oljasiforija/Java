package com.codingdojo.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class HumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanApplication.class, args);
	}
	@RequestMapping("/")
	public String hello() {
		return "Hello Human!";
	}
	@RequestMapping("/name")
	public String fName(@RequestParam(value="fName", required = true) String fName, @RequestParam(value="lName", required = false)String lName){
		if(lName == null) {
		return "Hello " + fName;
	}
		return "Hello " + fName + " " + lName;
	}
}
