
package spil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import gui_main.*;
import gui_fields.*;

public class Controller {
	static int PLAYER_START_BALANCE = 20;
	
	Board board = new Board();
	int currentTurn;
	Dice dice = new Dice();
	GUI gui;

	Player player[];
	GUI_Player playerGUI[];
	ChanceCard chanceCard[] = new ChanceCard[20];
	ChanceCard usedCardPile[] = new ChanceCard[20];
		
	public void init() {
		board.init();
		currentTurn = 0;
		board.initGUI();
		chanceCard = makeCards();
		chanceCard = shuffleCards(chanceCard);
		gui = new GUI(board.fieldsGUI);
		
		int playerAmount = gui.getUserInteger(Language.playerCount(), 2, 4);
		player = new Player[playerAmount];
		playerGUI = new GUI_Player[playerAmount];
		
		for (int i = 0; i < playerAmount; i++) {
			String tempName = gui.getUserString(Language.playerNameEntry(i+1));
			player[i] = new Player(tempName);
		}
		
		for (int i = 0; i < player.length; i++) {
			GUI_Player tempPlayer = new GUI_Player(player[i].getName(), player[i].account.getBalance());
			gui.addPlayer(tempPlayer);
			playerGUI[i]=tempPlayer;
		}
		
	}
	
	public void go() {
		
		while(true) {
			gui.showMessage(Language.newTurn(player[currentTurn].getName()));
			
			if(player[currentTurn].gotCard == true && player[currentTurn].free == false) {
				player[currentTurn].gotCard = false;
				player[currentTurn].free = true;
				gui.showMessage(Language.usedPrisonCard());
			}
	
			if(player[currentTurn].free == false) {
				gui.showMessage(Language.inPrison());
				player[currentTurn].account.add(-2); //it costs to get out of jail
				player[currentTurn].free = true;
			} else {
				gui.showMessage(Language.diceRoll());
				dice.roll();
				
				int oldLoc = player[currentTurn].getLocation();
				
				player[currentTurn].setLocation((oldLoc+dice.getFaceValue())%24);
				
				if (player[currentTurn].getLocation() < oldLoc) {
					player[currentTurn].account.add(2);
				}
				
				oldLoc = player[currentTurn].getLocation();
				landOnField(player[currentTurn].getLocation());
				if (player[currentTurn].getLocation() < oldLoc) {
					player[currentTurn].account.add(2);
				}
				
				for (int i = 0; i < player.length; i++) {
					if(player[i].account.getBalance() < 0) {
						player[i].bankrupt = true;
					}
				}
				updateGUI();
				
				currentTurn = (currentTurn+1) % player.length;
			}
			for (int i = 0; i < player.length; i++) {
				if(player[i].bankrupt == true) {
					playerWon(findWinner());
					break;
				}
			}
		}
	}

	public Player findWinner() {
		Player tempPlayer = null;
		int max = 0;
		for (int i = 0; i < player.length; i++) {
			if (!player[i].bankrupt) {
				if(player[i].account.getBalance() > max) {
					max = player[i].account.getBalance();
					tempPlayer = player[i];
				}
			}
		}	
		return tempPlayer;
	}

	public void updateGUI() {
		for (int i = 0; i < board.fieldsGUI.length; i++) {
			board.fieldsGUI[i].removeAllCars();
		}
		for (int i = 0; i < player.length; i++) {
			board.fieldsGUI[player[i].getLocation()].setCar(playerGUI[i], true);
			playerGUI[i].setBalance(player[i].account.getBalance());
		}
		gui.setDice(dice.getFaces()[0], dice.getFaces()[1]);
		
	}
	
	public void playerWon(Player winningPlayer) {
		gui.showMessage(Language.playerWon(winningPlayer.getName()));
		if(gui.getUserButtonPressed(Language.replay(), Language.replayConfirm(), Language.replayDecline())==Language.replayConfirm()) {
			init();
		} else {
			System.exit(0);
		}
	}
	
	public ChanceCard[] shuffleCards(ChanceCard[] cards) {
		ChanceCard[] tempCards = cards;
		
		List<ChanceCard> list = Arrays.asList(tempCards); //Convert to list
		Collections.shuffle(list); //Shuffle list
		list.toArray(tempCards); //Convert back to array
		
		return tempCards;
	}

	public ChanceCard[] makeCards(){
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
		chanceCard[13] = new ChanceCard("DET ER DIN FØDSELSDAG, alle giver dig en mønt");
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
			landOnField(player[currentTurn].getLocation());
		}
	break;
		case 1 :{
			player[currentTurn].setLocation(0);
			player[currentTurn].account.add(2);
		}
	break;
		case 2 :{ 
			player[currentTurn].setLocation(player[currentTurn].getLocation()+5);
		}
	break;
		case 3 :{
			forceMoveToField(10);
		}
	break;
		case 4 :{
			String label = gui.getUserSelection("Ryk et felt frem, eller tag et chancekort mere", "1 felt","Nyt kort");
			if (label.equals("1 felt")) {
				player[currentTurn].setLocation(player[currentTurn].getLocation()+1);
			}else {
				landOnField(player[currentTurn].getLocation());
			}
		}
	break;
		case 5 :{
			landOnField(player[currentTurn].getLocation());
		}
	break;
		case 6 :{
			player[currentTurn].account.add(-2);
		}
	break;
		case 7 :{
			if(player[currentTurn].getLocation() > 10 || player[currentTurn].getLocation() < 20) {
				forceMoveToField(19);
			}else {
				forceMoveToField(10);
			}
		}
	break;
		case 8 :{
			forceMoveToField(4);
		}
	break;
		case 9 :{
			player[currentTurn].gotCard = true;
		}
	break;
		case 10 :{
			player[currentTurn].setLocation(23);
			landOnField(player[currentTurn].getLocation());
		}
	break;
		case 11 :{
			landOnField(player[currentTurn].getLocation());
		}
	break;
		case 12 :{
			landOnField(player[currentTurn].getLocation());
		}
	break;
		case 13 :{
			for(int i=0; i<player.length;i++) {
				player[i].account.add(-1);
			}
			player[currentTurn].account.add(player.length);
		}
	break;
		case 14 :{
			if(player[currentTurn].getLocation() < 7) {
				forceMoveToField(7);
			}else {
				forceMoveToField(22);
			}
		}
	break;
		case 15 :{
			player[currentTurn].account.add(2);
		}
	break;
		case 16 :{
			forceMoveToField(13);
		}
	break;
		case 17 :{
			forceMoveToField(10);
		}
	break;
		case 18 :{
			if(player[currentTurn].getLocation() < 4 || player[currentTurn].getLocation() > 15) {
				forceMoveToField(13);
			}else {
				forceMoveToField(4);
			}
		}
	break;
		case 19 :{  
			if(player[currentTurn].getLocation() < 16) {
				forceMoveToField(16);
			}else {
				forceMoveToField(1);
			}
		}
	break;
		}
	}
	
	public void forceMoveToField(int fieldID) {
		player[currentTurn].setLocation(fieldID);
		if(board.fields[fieldID].isOwned == true) {
			landOnField(player[currentTurn].getLocation());
		}else {
			board.fields[fieldID].owner = player[currentTurn];
		}
	}
	
	public void landOnField(int fieldID){
		if(fieldID == 18) {
			player[currentTurn].setLocation(6);
			player[currentTurn].free = false;
			gui.displayChanceCard(player[currentTurn].name + "slog en " +dice.getFaceValue()+ " og ryger i fængsel");
		}
		if (board.fields[fieldID].isOwnable()) {
			if (board.fields[fieldID].isOwned == true){
				player[currentTurn].account.add(-board.fields[fieldID].rent);
				board.fields[fieldID].owner.account.add(board.fields[fieldID].rent);
				gui.displayChanceCard(player[currentTurn].name + "betaler husleje til "+board.fields[fieldID].owner.name);
			}else{
				player[currentTurn].account.add(-board.fields[fieldID].price);
				board.fields[fieldID].owner = player[currentTurn];
				board.fields[fieldID].isOwned = true;
				gui.displayChanceCard(player[currentTurn].name + " har købt " + board.fields[fieldID].fieldText+ " for" + board.fields[fieldID].price + " mønt(er)"  );
			}
		}
		if (board.fields[fieldID].isChance()) {
			for(int i=0;i<chanceCard.length;i++) {
				if (chanceCard[i] != null) {
					resolveChance(chanceCard[i].chanceID);
					gui.displayChanceCard(chanceCard[i].chanceText);
					usedCardPile[i]=chanceCard[i];
					chanceCard[i]=null;
					break;
				}
			}
		}
		
	}
	
	public static void main(String [] args) {
		Controller c = new Controller();
		c.init();
		c.go();
	}
}
