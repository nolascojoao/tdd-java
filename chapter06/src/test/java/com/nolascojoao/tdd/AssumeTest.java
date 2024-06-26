package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class AssumeTest {

	@Test
	public void shouldRunOnlyOnWindows() {
		assumeTrue(thisIsAWindowsMachine());
		System.out.println("running on Windows");
	}

	private boolean thisIsAWindowsMachine() {
		return System.getProperty("os.name").startsWith("Windows");
	}

	@Test
	public void shouldRunOnlyOnLinux() {
		assumeTrue(thisIsALinuxMachine());
		System.out.println("running on Linux!");
	}

	private boolean thisIsALinuxMachine() {
		return System.getProperty("os.name").startsWith("Linux");
	}

}
