package com.easyDoc.dao;

import java.util.List;

import com.easyDoc.model.User;

public interface UserDao {

	User findUserById(int id);
	User findUserByName(String userName);
	User findUserByEmail(String email);
	User findUserByPhone(String phone);
	List<User> findAllUsers();
	
	void insertUser(User user);
	void updateUser(User user);
	
}
