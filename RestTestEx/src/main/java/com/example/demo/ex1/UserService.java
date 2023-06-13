package com.example.demo.ex1;


public interface UserService {

	public User doGetOneUser(String username);
	
	public void doInsertUser(User user);
}
