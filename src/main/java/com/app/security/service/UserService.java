package com.app.security.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import org.springframework.stereotype.Service;

import com.app.security.model.User;


@Service
public class UserService {
	private List<User> store=new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"chandra","chandra@gmail.com"));
	}
	public List<User> getUser(){
		return this.store;
	}

}
