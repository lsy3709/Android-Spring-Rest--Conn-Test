package com.example.demo.ex1;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserMapper {
	
	
	public User doGetOneUser(String username);

	public void doInsertUser(User user);

}
