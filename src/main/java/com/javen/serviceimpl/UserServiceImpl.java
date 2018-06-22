package com.javen.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javen.dao.UserDao;
import com.javen.model.User;
import com.javen.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserById(int i) {
		return userDao.selectByPrimaryKey(i);
	}

}
