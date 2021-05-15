package board_game;

public class Infrastructure {

	private static final int GOVERNMENT = 0;
	private static final int EDUCATION = 1;
	private static final int ENERGY_SUPPLY = 2;
	private static final int FARM = 3;
	private static final int TRANSPORTATION = 4;
	private static final int UTILITIES = 5;
	
	private int type;
	private int level;
	
	private Currency currencyReturn;
	private int dividends;
	
	public Infrastructure(int type, int advantage) {
		this.type = type;
		this.level = advantage + 1;
	}
	
	public void upgradeInfrastructure() {
		level++;
	}
	
	
	
}
