package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseStringTest {

	@ParameterizedTest
	@MethodSource("getString")
	public void shouldReturnReverseStringWhenMethodCalled(String input, String expected) {
		String reverse = ReverseString.reverse(input);

		assertEquals(expected, reverse);
	}
	
	public static List<Object[]> getString() {
		return Arrays.asList(new Object[][] {
			{"a", "a"},
			{"hello", "olleh"},
			{"hello world", "dlrow olleh"},
			{"", ""},
			{"@#1", "1#@"}
		});
	}

}
