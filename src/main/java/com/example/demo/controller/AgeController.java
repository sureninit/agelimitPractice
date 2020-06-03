package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AgeModel;
import com.example.demo.service.AgeService;

@RestController
public class AgeController {
	
	@Value("${spring.application.name}")
	private String applicationName;
	
	@Autowired
	private AgeService ageservice;
	
	@RequestMapping(value="/check", method=RequestMethod.GET, produces="application/json")
	public String check() {
		return "ok"+" This is practice :"+applicationName;
	}
	
	@RequestMapping(value="/customer", method=RequestMethod.GET, produces="application/json")
	public AgeModel getCustomerDetails(@RequestParam("name") String name, @RequestParam("age") int age) {
		AgeModel message = ageservice.ageService(name,age);
		return message;
	}
	
	
}
