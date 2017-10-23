
package com.video.uploader.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.video.uploader.entity.User;

@Repository
public class UserDaoImpl implements UserDao 
{
	@Autowired
	private SessionFactory session;
	
	@Override
	public void save(User user) {
		session.getCurrentSession().save(user);
	}

}
