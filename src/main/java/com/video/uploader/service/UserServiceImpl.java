package com.video.uploader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.video.uploader.dao.UserDao;
import com.video.uploader.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public void createUser(User user) {
		userDao.save(user);
	}

}
