package spil;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import gui_codebehind.*;
import gui_main.*;
import gui_fields.*;

public class Controller {
	static int PLAYER_START_BALANCE = 30000;
	
	GUI gui = new GUI();
	Board board;
	int currentTurn;
	Dice dice;
	
	Player player[];
	ChanceCard chanceCard[];
	ChanceCard usedCardPile[];
		
	public void init() {
		board.init();
		currentTurn = 0;
		
		int playerAmount = gui.getUserInteger("Hvor mange spillere?", 2, 4);
		
		for (int i = 0; i > playerAmount; i++) {
			gui.getUserString();
		}
		
		for (int i = 0; i > player.length; i++) {
			GUI_Player tempPlayer = new GUI_Player(player[i].getName(), player[i].account.getBalance());
			gui.addPlayer(tempPlayer);
		}
		
		
		go();
	}
	
	public void go() {
		//Main game loop
	}
	
	public void updateGUI() {
		GUI.removeAllCars(player[currentTurn].getName());
		GUI.setCar(player[currentTurn].getLocation(), player[currentTurn].getNavn());
		int faceValue[] = player[currentTurn].getValues();
		GUI_BoardController.setDice(faceValue[0], faceValue[1]);
		GUI.setChanceCard(Language.fieldInfo(kast));
		GUI.displayChanceCard();
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
		chanceCard[6] = new ChanceCard("Du har spist for meget slik, betal 2 mønter til banken");
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
	
	public void resolveChance(int id){
		switch (id) {
		case 0 :{
			
		}
	break;
		case 1 :{
			
		}
	break;
		case 2 :{ 
			
		}
	break;
		case 3 :{
			
		}
	break;
		case 4 :{
			
		}
	break;
		case 5 :{
			
		}
	break;
		case 6 :{
			
		}
	break;
		case 7 :{
			
		}
	break;
		case 8 :{
			
		}
	break;
		case 9 :{
			
		}
	break;
		case 10 :{
			
		}
	break;
		case 11 :{
			
		}
	break;
		case 12 :{
			
		}
	break;
		case 13 :{
			
		}
	break;
		case 14 :{
			
		}
	break;
		case 15 :{
			
		}
	break;
		case 16 :{
			
		}
	break;
		case 17 :{
			
		}
	break;
		case 18 :{
			
		}
	break;
		case 19 :{  
			
		}
	break;
		}
	}
}
