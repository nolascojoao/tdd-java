package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

	@Test
	public void constructorShouldSetAmountAndCurrency() {
		Money money = new Money(10, "USD");

		assertEquals(10, money.getAmount());
		assertEquals("USD", money.getCurrency());
	}

}
