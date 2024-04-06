package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FahrenheitCelciusConverterTest {

	@ParameterizedTest
	@MethodSource("getCelciusToFahrenheit")
	public void shouldConvertCelciusToFahrenheit(Double celcius, Double expectedFahrenheit) {
		Double convertedToFahrenheit = FahrenheitCelciusConverter.celsiusToFahrenheit(celcius);

		assertEquals(expectedFahrenheit, convertedToFahrenheit);
	}

	@ParameterizedTest
	@MethodSource("getFahrenheitToCelcius")
	public void shouldConvertFahrenheitToCelcius(Double fahrenheit, Double expectedCelcius) {
		Double convertedToCelcius = FahrenheitCelciusConverter.fahrenheitToCelsius(fahrenheit);

		assertEquals(expectedCelcius, convertedToCelcius);
	}

	private static List<Double[]> getCelciusToFahrenheit() {
		return Arrays.asList(new Double[][] { 
			{ 32.0, 89.6 }, 
			{ 98.0, 208.4 }, 
			{ 212.0, 413.6 } 
			});
	}

	private static List<Double[]> getFahrenheitToCelcius() {
		return Arrays.asList(new Double[][] { 
			{ 89.6, 32.0 }, 
			{ 208.4, 98.0 }, 
			{ 413.6, 212.0 } 
			});
	}
}
