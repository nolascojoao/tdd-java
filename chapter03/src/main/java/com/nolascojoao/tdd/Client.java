package com.nolascojoao.tdd;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private List<Address> addresses;

	public Client() {
		this.addresses = new ArrayList<>();
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void addAddress(Address address) {
		addresses.add(address);
	}

}
