package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MoneyParameterizedTest {
	
	/* The Problem - violation of the DRY principle
	 
	@Test
	public void constructorShouldSetAmountAndCurrencyDirtyWay() {
		Money money = new Money(10, "USD");
		
		assertEquals(10, money.getAmount());
		assertEquals("USD", money.getCurrency());
		
		money = new Money(20, "EUR");
		
		assertEquals(20, money.getAmount());
		assertEquals("EUR", money.getCurrency());	
	}
	*/
	
	// The Solution	- parameterized tests and data providers
	
	private static final Object[] getMoney() {
		return new Object[] { 
				new Object[] { 10, "USD" }, 
				new Object[] { 20, "EUR" } 
				};
	}
	
	@ParameterizedTest
	@MethodSource("getMoney")
	public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
		Money money = new Money(amount, currency);
		
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}
}
