package com.learning.spring_learning.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.spring_learning.exception.ServiceException;
import com.learning.spring_learning.model.ApiResponse;
import com.learning.spring_learning.model.ServiceResponse;
import com.learning.spring_learning.model.User;
import com.learning.spring_learning.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	 private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());

	@Autowired
	UserService service;

	@GetMapping("/")
	public ResponseEntity<ApiResponse> getAllUsers() throws ServiceException {
		LOGGER.info("Handling request to find all users");
		ServiceResponse<List<User>> response = service.getAllUsers();
		ApiResponse apiResponse = new ApiResponse(response.isSuccess(), response.isError(), response.getMessage(),
				response.getBody());
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatusCode.valueOf(response.getStatusCode()));

	}

//	@PostMapping("/")
//	public User createUser(@RequestBody User user) {
//		return user;
//
//	}
//
//	@GetMapping("/{id}")
//	public User getUserById(@PathVariable("id") Integer id) {
//		return null;
//
//	}
//
//	@DeleteMapping("/{id}")
//	public void deleteUser(@PathVariable("id") Integer id) {
//
//	}
//
//	@PatchMapping("/{id}")
//	public User putMethodName(@PathVariable String id, @RequestBody String entity) {
//		// TODO: process PUT request
//
//		return null;
//	}

}
