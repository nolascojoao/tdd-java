package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MoneyIAETest {

	@Test
	public void constructorShouldThrowIAEForInvalidAmount() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Money(-5, "USD");
		});
	}

	@Test
	public void constructorShouldThrowIAEForInvalidCurrency() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Money(10, "");
		});
	}

}
