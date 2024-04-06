package com.nolascojoao.tdd;

public class FahrenheitCelciusConverter {

	public static Double celsiusToFahrenheit(Double celcius) {
		return (celcius * 9 / 5.0) + 32;
	}

	public static Double fahrenheitToCelsius(Double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9.0;
	}

}
