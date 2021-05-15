package board_game;

public class Currency {

	private static final int MONEY = 0;
	private static final int ENERGY = 1;
	private static final int KNOWLEDGE = 2;
	private static final int LIVESTOCK = 3;
	private static final int RESOURCES = 4;
	
	private int type;
	private int amount;
	
	public Currency(int type) {
		this.type = type;
		amount = 0;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void addAmount(int amount) {
		this.amount += amount;
	}
	
}
