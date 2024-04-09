package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

public class MockitoDefaultValueTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void testDefaultBehaviourOfTestDouble() {
		assertFalse(myFerrari.needsFuel(), " new test double should return false as boolean");
		assertEquals(0.0, myFerrari.getEngineTemperature(), " new test double should return 0.0 as double");
	}

}
