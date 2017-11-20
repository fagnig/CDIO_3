package spil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Controller {
	static int PLAYER_START_BALANCE = 30000;
	
	Board board;
	int currentTurn;
	Dice dice;
	
	Player player[];
	ChanceCard chanceCard[];
	
	public void init() {
		//setup players
	}
	
	public void go() {
		//Main game loop
	}
	
	public void updateGUI() {
		//refresh GUI
	}
	
	public void playerWon() {
		
	}
	
	public ChanceCard[] shuffleCards(ChanceCard[] cards) {
		ChanceCard[] tempCards = new ChanceCard[20];
		
		List<ChanceCard> list = Arrays.asList(tempCards); //Convert to list
		Collections.shuffle(list); //Shuffle list
		list.toArray(tempCards); //Convert back to array
		
		return tempCards;
	}

	public void playTurn(Player player) {
		
	}
}
