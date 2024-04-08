package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookingSystemTest {

	private BookingSystem bookingSystem;

	@BeforeEach
	public void setUp() {
		bookingSystem = new BookingSystem();
	}

	@Test
	public void shouldBookValidHour() {
		assertTrue(bookingSystem.bookHour(9));
	}

	@Test
	public void shouldNotBookInvalidHour() {
		assertFalse(bookingSystem.bookHour(-1));
	}

	@Test
	public void shouldNotBookAlreadyBookedHour() {
		bookingSystem.bookHour(10);
		
		assertFalse(bookingSystem.bookHour(10));
	}

	@Test
	public void shouldReturnEmptyBookedHours() {
		Set<Integer> bookedHours = bookingSystem.getBookedHours();
		
		assertTrue(bookedHours.isEmpty());
	}
	
	@Test
	public void shouldReturnNonEmptyBookedHours() {
		bookingSystem.bookHour(12);
		bookingSystem.bookHour(14);
		Set<Integer> bookedHours = bookingSystem.getBookedHours();
		
		assertFalse(bookedHours.isEmpty());
		assertEquals(2, bookedHours.size());
		assertTrue(bookedHours.contains(12));
		assertTrue(bookedHours.contains(14));
	}

}
