package com.learning.spring_learning.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring_learning.dao.UserDao;
import com.learning.spring_learning.enums.MessageEnum;
import com.learning.spring_learning.exception.ServiceException;
import com.learning.spring_learning.model.ServiceResponse;
import com.learning.spring_learning.model.User;
import com.learning.spring_learning.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	private static final Integer STATUS_CODE = 200;
	
	@Override
	public ServiceResponse<List<User>> getAllUsers() throws ServiceException {
		String message = MessageEnum.SUCCESSFUL_GET_ALL_USERS_DETAILS.getMessage();
		List<User> users = new ArrayList<User>();
		try {
			 users = userDao.getAllUsers();
			if (users.isEmpty())
				message = MessageEnum.NO_USERS_DETAILS_FOUND.getMessage();
		} catch (Exception e) {
			throw new ServiceException(e.getMessage());
		}
		return new ServiceResponse<List<User>>(true, false, message, users, STATUS_CODE);
	}

}
