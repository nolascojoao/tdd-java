package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashMapTest {

	private HashMap<String, String> hashMap;

	@BeforeEach
	public void setUpHashMap() {
		hashMap = new HashMap<>();
	}

	@Test
	public void shouldGetValueWhenObjectStoredWithPut() {
		hashMap.put("name", "Pedro");

		assertEquals("Pedro", hashMap.get("name"));
	}

	@Test
	public void shouldReplaceOldValueWhenAddingSecondObjectWithSameKey() {
		hashMap.put("name", "Pedro");

		hashMap.put("name", "João");

		assertEquals("João", hashMap.get("name"));
	}

	@Test
	public void shouldRemoveAllContentWhenClearMethodCalled() {
		hashMap.put("name", "Pedro");
		hashMap.put("name", "João");

		hashMap.clear();

		assertTrue(hashMap.isEmpty());
	}

	@Test
	public void shouldAllowNullAsKey() {
		hashMap.put(null, "Nolasco");

		assertEquals("Nolasco", hashMap.get(null));
	}

}
