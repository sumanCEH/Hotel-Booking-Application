package com.capgemini.exception;

public class RemoveUserException extends Exception {

	public RemoveUserException(String message) {
		super(message);
	}

	public RemoveUserException(Throwable cause) {
		super(cause);
	}

	public RemoveUserException(String message, Throwable cause) {
		super(message, cause);
	}

	public RemoveUserException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}
