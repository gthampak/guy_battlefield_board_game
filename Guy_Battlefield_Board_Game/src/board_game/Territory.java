package board_game;

import java.util.ArrayList;

public class Territory {

	private static final int NUM_INFRASTRUCTURES = 6;
	private static final int NW = 0;
	private static final int NE = 1;
	private static final int SE = 2;
	private static final int SW = 3;
	
	private int terNumber;
	
	private int[] adjTerritories;
	
	private Team team;
	private Infrastructure[] infrastructures;
	private ArrayList<BattleCard> battleCards;
	
	public Territory(int terNum, int[] adjacents) {
		terNumber = terNum;
		adjTerritories = adjacents;
		
		infrastructures = new Infrastructure[NUM_INFRASTRUCTURES];
		battleCards = new ArrayList<BattleCard>();
	}
	
	public int[] getAdjacents() {
		return adjTerritories;
	}
	
	public void setAdjacents(int[] adjacents) {
		adjTerritories = adjacents;
	}
	
}
