package com.nolascojoao.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class FootballTeamTest {

	private static final int ANY_NUMBER = 123;

	private static Object[] getNumberOfGamesWon() {
		return new Object[] { 0, 1, 2 };
	}
	
	private static Object[] getIllegalNumberOfGamesWon() {
		return new Object[] { -10, -1 };
	}

	@ParameterizedTest()
	@MethodSource("getNumberOfGamesWon")
	public void constructorShouldSetGamesWon(int numberOfGamesWon) {
		FootballTeam team = new FootballTeam(numberOfGamesWon);
		assertEquals(numberOfGamesWon, team.getGamesWon());
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

	@Test
	public void teamsWithMoreMatchesWonShouldBeGreater() {
		FootballTeam team_2 = new FootballTeam(2);
		FootballTeam team_3 = new FootballTeam(3);
		
		assertTrue(team_3.compareTo(team_2) > 0,
				" team with " + team_3.getGamesWon()
				+ " games won should be ranked before the team with "
				+ team_2.getGamesWon() + " games won");
	}

	@Test
	public void teamsWithLessMatchesWonShouldBeLesser() {
		FootballTeam team_2 = new FootballTeam(2);
		FootballTeam team_3 = new FootballTeam(3);
		
		assertTrue(team_2.compareTo(team_3) < 0,
				" team with " + team_2.getGamesWon()
				+ " games won should be ranked after the team with "
				+ team_3.getGamesWon() + " games won");
	}
	
	@Test
	public void teamsWithSameNumberOfMatchesWonShouldBeEqual() {
		FootballTeam teamA = new FootballTeam(2);
		FootballTeam teamB = new FootballTeam(2);
		
		assertTrue(teamA.compareTo(teamB) == 0,
				" both teams have won the same number of games: "
				+ teamA.getGamesWon() + " vs " + teamB.getGamesWon()
				+ " and should be ranked equal");
	}

}
