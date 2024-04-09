package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class MockitoThrowingExceptionsTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void throwException() {
		when(myFerrari.needsFuel()).thenThrow(new RuntimeException());
		
		assertThrows(RuntimeException.class, () -> myFerrari.needsFuel());
	}

}
