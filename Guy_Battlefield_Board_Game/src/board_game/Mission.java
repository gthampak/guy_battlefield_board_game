package board_game;

import java.util.ArrayList;

public class Mission {

	private static final int GENERAL = 0;
	private static final int EMPEROR = 1;
	private static final int CAPITALIST = 2;
	
	private int points;
	private int role;
	private String objective;
	
	public Mission(int points, int role, String objective) {
		this.points = points;
		this.role = role;
		this.objective = objective;
	}

	public ArrayList<Mission> missionList(){
		ArrayList<Mission> missionList = new ArrayList<Mission>();
		
		//put list of missions
		
		
		return missionList;
	}
	
}
