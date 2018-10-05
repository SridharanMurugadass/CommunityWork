package com.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
	
	@Autowired
	Repository repo;
	
	
	@GetMapping("/data")
public List<test> getData() {
		
		List<test> cc = repo.findAll();
		
		return cc;
		 
	}

}
