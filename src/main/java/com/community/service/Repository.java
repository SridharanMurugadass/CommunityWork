package com.community.service;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface Repository extends MongoRepository<test, String>{}