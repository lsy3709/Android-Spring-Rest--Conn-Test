package com.example.demo.ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/travel/user/")
public class TestController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello REST!";
	}
	
	@RequestMapping("/member")
	public MemberVO member() {
		MemberVO vo = new MemberVO();
		vo.setId("lsy");
		vo.setPwd("1234");
		vo.setName("이상용");
		vo.setEmail("lsy@naver.com");
		return vo;
	}
	
	@GetMapping("m")
	public User doGetOneUser(@RequestParam("username") String username) {
		User user = userService.doGetOneUser(username);
		System.out.println("oneUser=====doGetOneUser==============="+user);
		return user;
	}

}
