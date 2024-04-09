package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MockitoReturningDesiredValueTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void testStubbing() {
		assertFalse(myFerrari.needsFuel(), "new test double should return false as boolean");

		when(myFerrari.needsFuel()).thenReturn(true);

		assertTrue(myFerrari.needsFuel(), "after instructed test double should return what we want");
	}

}
