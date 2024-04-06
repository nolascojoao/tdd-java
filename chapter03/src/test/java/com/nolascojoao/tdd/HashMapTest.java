package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class HashMapTest {

	@Test
	public void testPutAndGet() {
		HashMap<String, String> map = new HashMap<>();

		map.put("name", "Pedro");

		assertEquals("Pedro", map.get("name"));
	}

	@Test
	public void testReplacement() {
		HashMap<String, String> map = new HashMap<>();

		map.put("name", "Pedro");

		// HashMap does not allow duplicate keys
		// if a key is added again its corresponding value will be replaced
		map.put("name", "João");

		assertEquals("João", map.get("name"));
	}

	@Test
	public void testClear() {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("name", "Pedro");
		map.put("name", "João");

		map.clear();

		assertTrue(map.isEmpty());
	}
	
	@Test
	public void testNullKey() {
		HashMap<String, String> map = new HashMap<>();
		
		map.put(null, "Nolasco");
		
		assertEquals("Nolasco", map.get(null));
	}

}
