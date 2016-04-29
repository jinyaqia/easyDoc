package com.easyDoc.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easyDoc.model.User;
import com.easyDoc.service.UserService;
import com.easyDoc.util.ServletResult;

@Controller
@RequestMapping("/user")
public class UserController {

	private static Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserService userService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody String insertUser(HttpServletRequest request,@RequestBody User user) {
		log.info(user.toString());
		log.info(request.getContentType());
		userService.insertUser(user);
		return "success insert";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public @ResponseBody ServletResult getUser(@PathVariable Integer id){
		ServletResult result = new ServletResult(200,userService.findUserById(id),"success");
		return result;
	}
	@RequestMapping(value="/name/{name}",method=RequestMethod.GET)
	public @ResponseBody User getUserByName(@PathVariable String name){
		return userService.findUserByName(name);
	}
	
}
