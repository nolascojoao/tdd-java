package com.nolascojoao.tdd;

import java.util.regex.Pattern;

public class PasswordValidator {

	private String password;
	private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";

	public PasswordValidator() {

	}

	public PasswordValidator(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public boolean isValid(String password) {
		return Pattern.matches(PASSWORD_PATTERN, password);
	}

}
