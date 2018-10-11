package com.community.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
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
	@GetMapping("/weather")
	public String getWeather() throws IOException {

		 ClassLoader classLoader = getClass().getClassLoader();
		    File file = new File(classLoader.getResource("test.json").getFile());
		    String data = FileUtils.readFileToString(file, "UTF-8");
	 

     System.out.println(data);        
		

		return data;

	}

}
