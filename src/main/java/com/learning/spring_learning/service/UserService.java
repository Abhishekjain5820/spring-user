package com.learning.spring_learning.service;

import java.util.List;

import com.learning.spring_learning.exception.ServiceException;
import com.learning.spring_learning.model.ServiceResponse;
import com.learning.spring_learning.model.User;

public interface UserService {

	ServiceResponse<List<User>> getAllUsers() throws ServiceException;
	
	

}
