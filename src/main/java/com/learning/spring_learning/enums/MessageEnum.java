package com.learning.spring_learning.enums;

import lombok.Getter;

@Getter
public enum MessageEnum {
	SUCCESSFUL_GET_ALL_USERS_DETAILS("Successfully Found All Users Detials"),
	NO_USERS_DETAILS_FOUND("No Users List Found, Try Creating New Users"),
	EXCEPTION_IN_GETTING_USERS_DETAILS("Exception Occured In getting users detials");

	private final String message;

	MessageEnum(String string) {
		message = string;
	}

}
