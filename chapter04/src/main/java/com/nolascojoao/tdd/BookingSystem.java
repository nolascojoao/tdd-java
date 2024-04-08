package com.nolascojoao.tdd;

import java.util.HashSet;
import java.util.Set;

public class BookingSystem {

	private Set<Integer> bookedHours;

	public BookingSystem() {
		bookedHours = new HashSet<>();
	}

	public boolean bookHour(int hour) {
		if (hour < 0 || hour > 23) {
			return false;
		}

		if (bookedHours.contains(hour)) {
			return false;
		}

		bookedHours.add(hour);
		return true;
	}

	public Set<Integer> getBookedHours() {
		return bookedHours;
	}

}
