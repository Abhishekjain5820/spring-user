package com.learning.spring_learning.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ApiResponse {
	private boolean isSuccess;
	private boolean isError;
	private String message;
	private Object body;
}
