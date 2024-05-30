package com.learning.spring_learning.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring_learning.converter.UserConverter;
import com.learning.spring_learning.dao.UserDao;
import com.learning.spring_learning.entity.UserEntity;
import com.learning.spring_learning.model.User;
import com.learning.spring_learning.repository.UserRepository;

@Service
public class UserDaoImpl implements UserDao {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserConverter converter;

	@Override
	public List<User> getAllUsers() {
		List<UserEntity> entities = userRepository.findAll();
		List<User> users = new ArrayList<User>();
		for (UserEntity entity : entities) {
			users.add(converter.getUserFromUserEntity(entity));
		}
		return users;
	}

}
