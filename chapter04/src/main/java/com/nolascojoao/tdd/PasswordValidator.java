package com.nolascojoao.tdd;

public class PasswordValidator {

	private String password;

	public PasswordValidator() {

	}

	public PasswordValidator(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public boolean isValid(String password) {
		// check if the password has at least 8 characters
		if (password.length() < 8) {
			return false;
		}

		// check if the password contains at least one uppercase letter
		boolean hasUpperCase = false;
		for (char c : password.toCharArray()) {
			if (Character.isUpperCase(c)) {
				hasUpperCase = true;
				break;
			}
		}
		if (!hasUpperCase) {
			return false;
		}

		// check if the password contains at least one lowercase letter
		boolean hasLowerCase = false;
		for (char c : password.toCharArray()) {
			if (Character.isLowerCase(c)) {
				hasLowerCase = true;
				break;
			}
		}

		// check if the password contains at least one digit
		boolean hasDigit = false;
		for (char c : password.toCharArray()) {
			if (Character.isDigit(c)) {
				hasDigit = true;
				break;
			}
		}
		if (!hasDigit) {
			return false;
		}

		// password it is considered valid if passes all checks
		return true;
	}

}
