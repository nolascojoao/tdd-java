package com.nolascojoao.tdd;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MockitoVereficationTest {
	
	private Car myFerrari = mock(Car.class);
	
	@Test
	public void testVerification() {
		myFerrari.driveTo("Sweet home Alabama");
		myFerrari.needsFuel();
		
		verify(myFerrari).driveTo("Sweet home Alabama");
		verify(myFerrari).needsFuel();
	}

}
