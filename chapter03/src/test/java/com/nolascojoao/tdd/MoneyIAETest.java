package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MoneyIAETest {

	public static final int VALID_AMOUNT = 10;
	public static final String VALID_CURRENCY = "USD";

	public static final int INVALID_AMOUNT = -5;
	public static final String INVALID_CURRENCY = null;

	@Test
	public void constructorShouldThrowIAEForInvalidAmount() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Money(INVALID_AMOUNT, VALID_CURRENCY);
		});
	}

	@Test
	public void constructorShouldThrowIAEForInvalidCurrency() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Money(VALID_AMOUNT, INVALID_CURRENCY);
		});
	}

}
