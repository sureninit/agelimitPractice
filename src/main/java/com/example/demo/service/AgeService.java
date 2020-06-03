package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.AgeModel;

@Component
public class AgeService {
	
	@Autowired
	private AgeModel agemodel;
	
	public AgeModel ageService(String name, int age) {
		agemodel.setAge(age);
		agemodel.setName(name);
		if(age<18) {
			agemodel.setMessage("you are not eligiable");
		}else if(age>18) {
			agemodel.setMessage("you are eligiable");
		}
		return agemodel;
		
	}

}
