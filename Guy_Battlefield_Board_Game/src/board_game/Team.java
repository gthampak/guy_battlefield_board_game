package board_game;

import java.util.ArrayList;

public class Team {

	private int team;
	private Player[] players;
	private Currency[] wealth;
	
	public Team(int team, int numPlayers, ArrayList<Integer> roles) {
		this.team = team;
		wealth = new Currency[5];
		
		for(int i = 0; i < wealth.length; i++) {
			wealth[i] = new Currency(i);
		}
		
		players = new Player[numPlayers];
		
		for(int i = 0; i < players.length; i++) {
			players[i] = new Player(team, roles.get(i));
		}
		
	}
	
}
