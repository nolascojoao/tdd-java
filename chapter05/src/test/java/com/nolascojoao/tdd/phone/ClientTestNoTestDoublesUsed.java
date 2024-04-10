package com.nolascojoao.tdd.phone;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ClientTestNoTestDoublesUsed {

	private final static String ANY_NUMBER = "999-888-777";
	private final static Phone MOBILE_PHONE = new Phone(ANY_NUMBER, true);
	private final static Phone STATIONARY_PHONE = new Phone(ANY_NUMBER, false);

	Client client = new Client();

	@Test
	public void shouldReturnTrueIfClientHashMobile() {
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
