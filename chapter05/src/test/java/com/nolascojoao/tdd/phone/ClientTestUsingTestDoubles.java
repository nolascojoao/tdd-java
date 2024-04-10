package com.nolascojoao.tdd.phone;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class ClientTestUsingTestDoubles {

	private final static Phone MOBILE_PHONE = mock(Phone.class);
	private final static Phone STATIONARY_PHONE = mock(Phone.class);

	Client client = new Client();

	@Test
	public void shouldReturnTrueIfClientHashMobile() {
		when(MOBILE_PHONE.isMobile()).thenReturn(true);
		
		client.addPhone(MOBILE_PHONE);
		client.addPhone(STATIONARY_PHONE);
		
		assertTrue(client.hasMobile());
	}

	@Test
	public void shouldReturnFalseIfClientHasNoMobile() {
		client.addPhone(STATIONARY_PHONE);

		assertFalse(client.hasMobile());
	}

}
