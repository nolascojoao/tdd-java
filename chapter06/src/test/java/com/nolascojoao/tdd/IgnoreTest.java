package com.nolascojoao.tdd;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class IgnoreTest {
	
	@Test
	public void shouldBeRun() {
		System.out.println("shouldbeRun() is running!");
	}
	
	@Disabled
	@Test
	public void shouldBeIgnored() {
		System.out.println("huh, not ignored?!");;
	}

}
