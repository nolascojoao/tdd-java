package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseStringTest {

	private ReverseString reverse;

	@BeforeEach
	public void setUp() {
		reverse = new ReverseString();
	}

	@ParameterizedTest
	@MethodSource("getString")
	public void shouldReturnReverseStringWhenMethodCalled(String input, String expected) {
		String reversed = reverse.reverse(input);

		assertEquals(expected, reversed);
	}

	@Test
	public void shouldThrowIllegalArgumentExceptionWhenInputIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			reverse.reverse(null);
		});
	}

	public static List<Object[]> getString() {
		return Arrays.asList(new Object[][] { 
			{ "a", "a" }, 
			{ "hello", "olleh" }, 
			{ "hello world", "dlrow olleh" },
			{ "", "" }, { "@#1", "1#@" } 
				});
	}

}
