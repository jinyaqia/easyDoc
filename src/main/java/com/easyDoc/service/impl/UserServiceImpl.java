package com.easyDoc.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.easyDoc.dao.UserDao;
import com.easyDoc.model.User;
import com.easyDoc.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserDao userDao;
	
	@Override
	public User findUserById(int id) {
		log.info("find user by id:"+id);
		return userDao.findUserById(id);
	}

	@Override
	public User findUserByName(String userName) {
		log.info("find user by name: "+userName);
		return userDao.findUserByName(userName);
	}

	@Override
	public User findUserByEmail(String email) {
		return userDao.findUserByEmail(email);
	}

	@Override
	public User findUserByPhone(String phone) {
		return userDao.findUserByPhone(phone);
	}

	@Override
	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}

	@Override
	public void insertUser(User user) {
		System.out.println("insert user "+user);
		userDao.insertUser(user);
	}

	@Override
	public void updateUser(User user) {
			
	}

}
