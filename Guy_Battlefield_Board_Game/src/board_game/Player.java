package board_game;

public class Player {
	
	private static final int GENERAL = 0;
	private static final int EMPEROR = 1;
	private static final int CAPITALIST = 2;
	
	private int team;
	private int points;
	private int role;
	
	
	public Player(int team, int role) {
		this.team = team;
		points = 0;
		this.role = role;
	}
	
}
