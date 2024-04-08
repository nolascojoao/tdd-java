package com.nolascojoao.tdd;

public class FootballTeam implements Comparable<FootballTeam> {

	private int gamesWon;

	public FootballTeam(int gamesWon) {
		if (gamesWon < 0) {
			throw new IllegalArgumentException("input value cannot be negative");
		}

		this.gamesWon = gamesWon;
	}

	public int getGamesWon() {
		return gamesWon;
	}

	@Override
	public int compareTo(FootballTeam o) {
		return 0;
	}

}
