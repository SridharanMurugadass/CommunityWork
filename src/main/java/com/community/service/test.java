package com.community.service;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test")
public class test {

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	private String id;
	
	private List<String> data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

}
