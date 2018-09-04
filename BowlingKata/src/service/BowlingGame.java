package service;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
		
	private int turn = 0;
	private int[] ligne = new int[21];
	
	private List<Integer> ligne2 = new ArrayList<Integer>();
	
	public void roll(int...pinsDown) {
						
		for(int pin : pinsDown) {
			ligne[turn ++] = pin;
		}
		
	}
	
	public void roll2(String pinsDown) {
		String[] rolls = pinsDown.split(" ");
		
		stringToIntTab(rolls);
		
		for(int i=0; i<ligne2.size(); i++) {
			//System.out.println(ligne2.get(i));
			ligne[i] = ligne2.get(i);
		}
		
		
	}

	private void stringToIntTab(String[] rolls) {
		int index = 0;
		for(String str : rolls) {
			if(str.equals("X")) {
				ligne2.add(10);
				index ++;
			}
			else {
				char[] tab = str.toCharArray();
				for(char c : tab) {
					if(c == '-') {
						ligne2.add(0);
						index ++;
					}
					else if(c == '/') {
						ligne2.add(10 - ligne2.get(index -1));
						index ++;
					}
					else {
						ligne2.add(Character.getNumericValue(c));
						index ++;
					}
				}
			}
			
		}
	}
	
	public int getScore() {
		int score = 0;
		int turnCount = 0;
		for(int frame=0; frame<10; frame ++) {
			if(isStrike(turnCount)) {
				score += ligne[turnCount] + ligne[turnCount+1]+ ligne[turnCount+2];
				turnCount++;
			}
			
			else if(isSpare(turnCount)) {
				score += ligne[turnCount] + ligne[turnCount+1]+ ligne[turnCount+2];
				turnCount+=2;
			}
			else {
			score += ligne[turnCount] + ligne[turnCount+1];
			turnCount+=2;
			}
		}
		return score;
	}

	private boolean isStrike(int turnCount) {
		return ligne[turnCount] == 10;
	}

	private boolean isSpare(int turnCount) {
		return ligne[turnCount] + ligne[turnCount+1] == 10;
	}
	
}
