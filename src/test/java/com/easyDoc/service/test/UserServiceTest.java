package com.easyDoc.service.test;

import org.joda.time.DateTime;
import com.easyDoc.model.User;
import com.easyDoc.service.UserService;
import com.easyDoc.service.impl.UserServiceImpl;

public class UserServiceTest {

	public static void main(String[] args) {
		
		UserService userService = new UserServiceImpl();
		
		User user = new User();
		user.setUserName("jinyaqia");
		user.setEmail("10025354@qq.com");
		user.setBirthday(new DateTime().toDate());
		user.setRegTime(new DateTime().toDate());
		user.setMark(232);
		
		userService.insertUser(user);
		
		System.out.println(userService.findAllUsers());
		

	}

}
