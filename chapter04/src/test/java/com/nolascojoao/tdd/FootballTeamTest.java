package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FootballTeamTest {
	
	@Test
	public void constructorShouldSetGamesWon() {
		FootballTeam team = new FootballTeam(3);
		assertEquals(3, team.getGamesWon());
	}

}
