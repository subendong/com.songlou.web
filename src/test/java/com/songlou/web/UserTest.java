package com.songlou.web;

import org.junit.Test;

import pojo.User;
import service.UserService;

public class UserTest {
	private UserService userService = new UserService();
	
	@Test
	public void main() {
		// TODO Auto-generated method stub
		User user = userService.findByUserId(1);
		
		System.out.println(user.toString());
	}
}
