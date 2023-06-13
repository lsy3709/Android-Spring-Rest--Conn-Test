package com.example.demo.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User doGetOneUser(String username) {
		System.out.println("oneUser=====doGetOneUser===============전"+username);
		return userMapper.doGetOneUser(username);
		
	}

	@Override
	public void doInsertUser(User user) {
		userMapper.doInsertUser(user);
	}

}
