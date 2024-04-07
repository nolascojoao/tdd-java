package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FootballTeamTest {

	private static final int THREE_GAMES_WON = 3;

	@Test
	public void constructorShouldSetGamesWon() {
		FootballTeam team = new FootballTeam(THREE_GAMES_WON);
		assertEquals(THREE_GAMES_WON, team.getGamesWon());
	}

	private static Object[] getNumberOfGamesWon() {
		return new Object[] { 0, 1, 2 };
	}

	@ParameterizedTest()
	@MethodSource("getNumberOfGamesWon")
	public void constructorShouldSetGamesWon(int numberOfGamesWon) {
		FootballTeam team = new FootballTeam(numberOfGamesWon);
		assertEquals(numberOfGamesWon, team.getGamesWon());
	}

	private static Object[] getIllegalNumberOfGamesWon() {
		return new Object[] { -10, -1 };
	}

	@ParameterizedTest
	@MethodSource("getIllegalNumberOfGamesWon")
	public void constructorShouldThrowExceptionForIllegalGamesNumber(int illegalNumberOfGames) {
		assertThrows(IllegalArgumentException.class, () -> {
			new FootballTeam(illegalNumberOfGames);
		});
	}

}
