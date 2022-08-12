package br.com.SystemLogin.exception;

import javax.servlet.ServletException;

public class InvalidUserException extends ServletException{
	public InvalidUserException(String message) {
		super(message);
	}
}
