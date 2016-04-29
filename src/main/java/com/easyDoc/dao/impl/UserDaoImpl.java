package com.easyDoc.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.easyDoc.dao.AbstractDao;
import com.easyDoc.dao.UserDao;
import com.easyDoc.model.User;

@SuppressWarnings("unchecked")
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	@Override
	public User findUserById(int id) {
		return getByKey(id);
	}

	@Override
	public User findUserByName(String userName) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("userName", userName));
		return (User) criteria.uniqueResult();
	}

	@Override
	public User findUserByEmail(String email) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("email", email));
		return (User) criteria.uniqueResult();
	}

	@Override
	public User findUserByPhone(String phone) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("phone", phone));
		return (User) criteria.uniqueResult();
	}

	@Override
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

	@Override
	public void insertUser(User user) {
		persist(user);
	}

	@Override
	public void updateUser(User user) {
	}

}
