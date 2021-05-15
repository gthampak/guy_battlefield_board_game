package board_game;

import java.util.ArrayList;

public class Territory {

	private static final int NUM_INFRASTRUCTURES = 6;
	private static final int NW = 0;
	private static final int NE = 1;
	private static final int SE = 2;
	private static final int SW = 3;
	
	private int terNumber;
	private int[] advPoints;
	
	private int[] adjTerritories;
	
	private Team team;
	private Infrastructure[] infrastructures;
	private ArrayList<BattleCard> battleCards;
	
	public Territory(int terNum, int[] adjacents) {
		terNumber = terNum;
		adjTerritories = adjacents;
		
		infrastructures = new Infrastructure[NUM_INFRASTRUCTURES];
		battleCards = new ArrayList<BattleCard>();
		
		setAdvantagePoints();
	}
	
	/**
	 * @return array of adjacent territories
	 */
	public int[] getAdjacents() {
		return adjTerritories;
	}
	
	/**
	 * @param adjacents; array of adjacent territories
	 */
	public void setAdjacents(int[] adjacents) {
		adjTerritories = adjacents;
	}
	
	/**
	 * @return Territory's team
	 */
	public Team getTeam() {
		return team;
	}
	
	/**
	 * Set territory ownership
	 * 
	 * @param team
	 */
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public void setAdvantagePoints() {
		advPoints = new int[4];
		
	
		
	}
	
}
