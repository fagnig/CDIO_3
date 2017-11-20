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
	public ChanceCard[] MakeCards(){
		//Makes empty array of ChanceCards
		ChanceCard[] chanceCard = new ChanceCard[20];
		chanceCard[0] = new ChanceCard("tag et chancekort mere");
		chanceCard[1] = new ChanceCard("Ryk frem til START og modtag to mønter");
		chanceCard[2] = new ChanceCard("Ryk 5 felter frem");
		chanceCard[3] = new ChanceCard("Ryk frem til et orange felt, er det ledigt får du det GRATIS, hvis ikke skal BETALE leje");
		chanceCard[4] = new ChanceCard("Ryk et felt frem, eller tag et chancekort mere");
		chanceCard[5] = new ChanceCard("Tag et chancekort mere");
		chanceCard[6] = new ChanceCard("Du har spist for meget, betal 2 mønter til banken");
		chanceCard[7] = new ChanceCard("Ryk frem til et grønt eller orange felt, er det ledigt får du det GRATIS, hvis ikke skal BETALE leje");
		chanceCard[8] = new ChanceCard("Ryk frem til lyseblåt felt, er det ledigt får du det GRATIS, hvis ikke skal BETALE leje");
		chanceCard[9] = new ChanceCard("Når du kommer i fængsel kan du bruge dette kort til at komme ud gratis");
		chanceCard[10] = new ChanceCard("Ryk frem til Strandpromenaden");
		chanceCard[11] = new ChanceCard("Tag et kort mere");
		chanceCard[12] = new ChanceCard("Tag et kort mere");
		chanceCard[13] = new ChanceCard("DET ER DIN FØDSELSDAG, alle give dig en mønt");
		chanceCard[14] = new ChanceCard("Ryk frem til et pink eller mørkeblåt felt, er det ledigt får du det GRATIS, hvis ikke skal BETALE leje");
		chanceCard[15] = new ChanceCard("Du har lavet alle dine lektier, banken giver dig to mønter");
		chanceCard[16] = new ChanceCard("Ryk frem til et rødt felt, er det ledigt får du det GRATIS, hvis ikke skal BETALE leje");
		chanceCard[17] = new ChanceCard("Ryk frem til skaterparken for at lave det perfekte grind, er det ledigt får du det GRATIS, hvis ikke skal BETALE leje ");
		chanceCard[18] = new ChanceCard("Ryk frem til et lyseblåt eller rødt felt, er det ledigt får du det GRATIS, hvis ikke skal BETALE leje");
		chanceCard[19] = new ChanceCard("Ryk frem til et brunt eller gult felt, er det ledigt får du det GRATIS, hvis ikke skal BETALE leje");
	return chanceCard;
	}
}
