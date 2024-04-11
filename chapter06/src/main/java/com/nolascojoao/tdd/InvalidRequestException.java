package com.nolascojoao.tdd;

public class InvalidRequestException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidRequestException() {
		super("Invalid request");
	}

}
