package com.nolascojoao.tdd;

import java.util.HashSet;
import java.util.Set;

public class BookingSystem {

	private final Set<Integer> bookedHours;

	public BookingSystem() {
		bookedHours = new HashSet<>();
	}

	public boolean bookHour(int hour) {
		if (isValidHour(hour) && isNotAlreadyBooked(hour)) {
			bookedHours.add(hour);
			return true;
		}
		return false;
	}

	public Set<Integer> getBookedHours() {
		return new HashSet<>(bookedHours);
	}

	private boolean isValidHour(int hour) {
		return hour >= 0 && hour <= 23;
	}

	private boolean isNotAlreadyBooked(int hour) {
		return !bookedHours.contains(hour);
	}
}
