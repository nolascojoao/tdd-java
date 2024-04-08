package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
	
	private PasswordValidator passValidator;
	
	@BeforeEach
	public void setUp() {
		passValidator = new PasswordValidator();
	}
	
	@Test
	public void validPasswordShouldPassValidation() {
		assertTrue(passValidator.isValid("StrongPass123"));
	}

}
