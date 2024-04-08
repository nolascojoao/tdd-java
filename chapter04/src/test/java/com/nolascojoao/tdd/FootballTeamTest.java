package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FootballTeamTest {

	private static final int THREE_GAMES_WON = 3;
	private static final int ANY_NUMBER = 123;

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

	@Test
	public void shouldBePossibleToCompareTeams() {
		FootballTeam team = new FootballTeam(ANY_NUMBER);

		assertTrue(team instanceof Comparable, "FootballTeam should implement Comparable");
	}

}
