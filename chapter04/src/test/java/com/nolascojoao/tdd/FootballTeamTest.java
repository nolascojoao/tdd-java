package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FootballTeamTest {

	private static final int THREE_GAMES_WON = 3;

	@Test
	public void constructorShouldSetGamesWon() {
		FootballTeam team = new FootballTeam(THREE_GAMES_WON);
		assertEquals(THREE_GAMES_WON, team.getGamesWon());
	}

}
