package com.learning.spring_learning.converter;

import org.springframework.stereotype.Service;

import com.learning.spring_learning.entity.UserEntity;
import com.learning.spring_learning.model.User;

@Service
public class UserConverter {
  
	public UserEntity getUserEntityFromUser(User user) {
		UserEntity entity = new UserEntity();
		entity.setUserAge(user.getUserAge());
		entity.setUserEmail(user.getUserEmail());
		entity.setUserId(user.getUserId());
		entity.setUserName(user.getUserName());
		
		return entity;
	} 
	
	public User getUserFromUserEntity(UserEntity userEntity) {
		User user=new User();
		user.setUserId(userEntity.getUserId());
		user.setUserName(userEntity.getUserName());
		user.setUserEmail(userEntity.getUserEmail());
		user.setUserAge(userEntity.getUserAge());
		
		return user;
	}
}
