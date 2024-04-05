package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientTest {

	private Address addressA = new Address("street A");
	private Address addressB = new Address("street B");
	private Client client;

	@BeforeEach
	public void setUp() {
		client = new Client();
	}

	@Test
	public void afterCreationShouldHaveNoAddress() {
		assertEquals(0, client.getAddresses().size());
	}

	@Test
	public void shouldAllowToAddAddress() {
		client.addAddress(addressA);

		assertEquals(1, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
	}

	@Test
	public void shouldAllowToAddManyAddresses() {
		client.addAddress(addressA);
		client.addAddress(addressB);

		assertEquals(2, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
		assertTrue(client.getAddresses().contains(addressB));
	}

}
