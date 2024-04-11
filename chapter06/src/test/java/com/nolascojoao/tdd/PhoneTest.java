package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * This style of try-catch usage is employed here to test scenarios where the setNumber() method
 * is expected to throw specific exceptions. Although it's generally not recommended to use
 * try-catch in tests due to obscuring the logic and potentially hiding issues, it's necessary
 * in this case to capture the exceptions thrown by the method under test and perform assertions on them.
 */
public class PhoneTest {

	Phone phone = new Phone();

	@Test
	public void shouldThrowIAEForEmptyNumber() {
		try {
			phone.setNumber(null);
			fail("Should have thrown IllegalArgumentException");
		} catch (IllegalArgumentException iae) {
			assertEquals("number can not be null or empty", iae.getMessage());
		}
	}

	@Test
	public void shouldThrowIAEForPlusPreFixedNumber() {
		try {
			phone.setNumber("+123");
			fail("Should have thrown IllegalArgumentException");
		} catch (IllegalArgumentException iae) {
			assertEquals("plus sign prefix not allowed, " + "number: [+123]", iae.getMessage());
		}
	}
	
}
