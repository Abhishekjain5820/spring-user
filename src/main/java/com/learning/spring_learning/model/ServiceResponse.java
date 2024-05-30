package com.learning.spring_learning.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceResponse<T> {
	
	private boolean isSuccess;
	private boolean isError;
	private String message;
	private T body;
	private Integer statusCode;
	
	

}
