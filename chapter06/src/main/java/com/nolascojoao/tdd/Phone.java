package com.nolascojoao.tdd;

public class Phone {
	
	private String number;
	
	public Phone() {
		
	}
	
	 /*
     * This method throws the same exception twice. 
     * This is a rare case where using try/catch in a test class may be necessary.
     */
	public void setNumber(String number) {
		if (null == number || number.isEmpty()) {
			throw new IllegalArgumentException(
					"number can not be null or empty");
		}
		if (number.startsWith("+")) {
			throw new IllegalArgumentException(
					"plus sign prefix not allowed, number: [" + number + "]");
		}
		this.number = number;
	}

}
