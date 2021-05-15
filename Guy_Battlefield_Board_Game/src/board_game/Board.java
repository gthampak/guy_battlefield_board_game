package board_game;

import java.util.ArrayList;

public class Board {

	private Territory[] territories;
	
	public Board(boolean isOriginal) {
		if(isOriginal) {
			territories = new Territory[32];
			
			int[] adjs0 = {31, 28, 4, 7};
			int[] adjs1 = {28, 29, 5, 4};
			int[] adjs2 = {29, 30, 6, 5};
			int[] adjs3 = {30, 31, 7, 6};
			int[] adjs4 = {0, 1, 9, 8};
			int[] adjs5 = {1, 2, 10, 9};
			int[] adjs6 = {2, 3, 11, 10};
			int[] adjs7 = {3, 0, 8, 11};
			int[] adjs8 = {7, 4, 12, 15};
			int[] adjs9 = {4, 5, 13, 12};
			int[] adjs10 = {5, 6, 14, 13};
			int[] adjs11 = {6, 7, 15, 14};
			int[] adjs12 = {8, 9, 17, 16};
			int[] adjs13 = {9, 10, 18, 17};
			int[] adjs14 = {10, 11, 19, 18};
			int[] adjs15 = {11, 8, 16, 19};
			int[] adjs16 = {15, 12, 20, 23};
			int[] adjs17 = {12, 13, 21, 20};
			int[] adjs18 = {13, 14, 22, 21};
			int[] adjs19 = {14, 15, 23, 22};
			int[] adjs20 = {16, 17, 25, 24};
			int[] adjs21 = {17, 18, 26, 25};
			int[] adjs22 = {18,9, 27, 26};
			int[] adjs23 = {19, 16, 24, 27};
			int[] adjs24 = {23, 20, 28, 31};
			int[] adjs25 = {20, 21, 29, 28};
			int[] adjs26 = {21, 22, 30, 29};
			int[] adjs27 = {22, 23, 31, 30};
			int[] adjs28 = {24, 25, 1, 0};
			int[] adjs29 = {25, 26, 2, 1};
			int[] adjs30 = {26, 27, 3, 2};
			int[] adjs31 = {27, 24, 0, 3};
					
			ArrayList<int[]> adjs = new ArrayList<int[]>();
			adjs.add(adjs0);
			adjs.add(adjs1);
			adjs.add(adjs2);
			adjs.add(adjs3);
			adjs.add(adjs4);
			adjs.add(adjs5);
			adjs.add(adjs6);
			adjs.add(adjs7);
			adjs.add(adjs8);
			adjs.add(adjs9);
			adjs.add(adjs10);
			adjs.add(adjs11);
			adjs.add(adjs12);
			adjs.add(adjs13);
			adjs.add(adjs14);
			adjs.add(adjs15);
			adjs.add(adjs16);
			adjs.add(adjs17);
			adjs.add(adjs18);
			adjs.add(adjs19);
			adjs.add(adjs20);
			adjs.add(adjs21);
			adjs.add(adjs22);
			adjs.add(adjs23);
			adjs.add(adjs24);
			adjs.add(adjs25);
			adjs.add(adjs26);
			adjs.add(adjs27);
			adjs.add(adjs28);
			adjs.add(adjs29);
			adjs.add(adjs30);
			adjs.add(adjs31);
			
			for(int i = 0; i < territories.length; i++) {
				territories[i] = new Territory(i, adjs.get(i));
			}
			
		} else {
			
		}
		
	}

	/**
	 * main test 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Board test = new Board(true);
		for(int i = 0; i < test.territories[0].getAdjacents().length; i++) {
			System.out.println(test.territories[0].getAdjacents()[i]);
		}
	}
	
}
