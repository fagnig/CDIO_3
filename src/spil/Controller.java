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
	
	Board board = new Board();
	int currentTurn;
	Dice dice;
	GUI gui;
	int playerAmount;

	Player players[];
	ChanceCard chanceCard[];
	ChanceCard usedCardPile[];
		
	public void init() {
		board.init();
		currentTurn = 0;
		initGUI();
		
		gui = new GUI(fieldsGUI);
		
		playerAmount = gui.getUserInteger(Language.playerCount(), 2, 4);
		players = new Player[playerAmount];
		
		for (int i = 0; i < playerAmount; i++) {
			String tempName = gui.getUserString(Language.playerNameEntry(i+1));
			players[i] = new Player(tempName);
		}
		
		for (int i = 0; i < players.length; i++) {
			GUI_Player tempPlayer = new GUI_Player(players[i].getName(), players[i].getBalance());
			gui.addPlayer(tempPlayer);
		}
		
		
	}
	
	public void go() {
		//Main game loop
	}
	
	public void updateGUI() {
		
	}
	
	public void playerWon() {
		gui.showMessage(Language.playerWon(players[currentTurn].getName()));
		if(gui.getUserButtonPressed(Language.replay(), Language.replayConfirm(), Language.replayDecline())==Language.replayConfirm()) {
			init();
		} else {
			System.exit(0);
		}
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
		chanceCard[3] = new ChanceCard("Ryk frem til et orange felt, er det ledigt får du det GRATIS, hvis ikke skal du BETALE leje");
		chanceCard[4] = new ChanceCard("Ryk et felt frem, eller tag et chancekort mere");
		chanceCard[5] = new ChanceCard("Tag et chancekort mere");
		chanceCard[6] = new ChanceCard("Du har spist for meget slik, betal 2 mønter til banken");
		chanceCard[7] = new ChanceCard("Ryk frem til et grønt eller orange felt, er det ledigt får du det GRATIS, hvis ikke skal du BETALE leje");
		chanceCard[8] = new ChanceCard("Ryk frem til lyseblåt felt, er det ledigt får du det GRATIS, hvis ikke skal du BETALE leje");
		chanceCard[9] = new ChanceCard("Når du kommer i fængsel kan du bruge dette kort til at komme ud gratis");
		chanceCard[10] = new ChanceCard("Ryk frem til Strandpromenaden");
		chanceCard[11] = new ChanceCard("Tag et kort mere");
		chanceCard[12] = new ChanceCard("Tag et kort mere");
		chanceCard[13] = new ChanceCard("DET ER DIN FØDSELSDAG, alle giver dig en mønt");
		chanceCard[14] = new ChanceCard("Ryk frem til et pink eller mørkeblåt felt, er det ledigt får du det GRATIS, hvis ikke skal du BETALE leje");
		chanceCard[15] = new ChanceCard("Du har lavet alle dine lektier, banken giver dig to mønter");
		chanceCard[16] = new ChanceCard("Ryk frem til et rødt felt, er det ledigt får du det GRATIS, hvis ikke skal du BETALE leje");
		chanceCard[17] = new ChanceCard("Ryk frem til skaterparken for at lave det perfekte grind, er det ledigt får du det GRATIS, hvis ikke skal du BETALE leje ");
		chanceCard[18] = new ChanceCard("Ryk frem til et lyseblåt eller rødt felt, er det ledigt får du det GRATIS, hvis ikke skal du BETALE leje");
		chanceCard[19] = new ChanceCard("Ryk frem til et brunt eller gult felt, er det ledigt får du det GRATIS, hvis ikke skal du BETALE leje");
		return chanceCard;
	}
	public void resolveChance(Player player, ChanceCard chancecard){
		switch (chancecard.getID()) {
		case 0 :{
			resolveChance(player,chanceCard[0]);
		}
	break;
		case 1 :{
			player.setLocation(0);
			player.add(2);
		}
	break;
		case 2 :{ 
			player.move(5);
		}
	break;
		case 3 :{
			while(!board.getField(player.getLocation()).getColor().equals(Color.orange)){
				player.move(1);
				}
			board.getField(player.getLocation()).landOnField(player);
		}
	break;
		case 4 :{
			if (gui.getUserLeftButtonPressed("Ryk enten 1 felt frem, eller træk et nyt kort", "ryk et felt frem", "Træk et nyt kort"))
				player.move(1);
			else resolveChance(player,chanceCard[0]);
		}
	break;
		case 5 :{
			resolveChance(player,chanceCard[0]);
		}
	break;
		case 6 :{
			player.add(-2);
		}
	break;
		case 7 :{
			while(!(board.getField(player.getLocation()).getColor().equals(Color.orange) || board.getField(player.getLocation()).getColor().equals(Color.green))){
				player.move(1);
				}
			board.getField(player.getLocation()).landOnField(player);
		}
	break;
		case 8 :{
			while(!(board.getField(player.getLocation()).getColor().equals(Color.magenta))){
				player.move(1);
				}
			board.getField(player.getLocation()).landOnField(player);
		}
	break;
		case 9 :{
			player.setGotCard();
		}
	break;
		case 10 :{
			player.setLocation(23);
			board.getField(player.getLocation()).landOnField(player);
		}
	break;
		case 11 :{
			resolveChance(player,chanceCard[0]);
		}
	break;
		case 12 :{
			resolveChance(player,chanceCard[0]);
		}
	break;
		case 13 :{
			player.add(playerAmount);
			for(int i = 0; i < playerAmount; i++)
				players[i].add(-1);
		}
	break;
		case 14 :{
			while(!(board.getField(player.getLocation()).getColor().equals(Color.pink) || board.getField(player.getLocation()).getColor().equals(Color.blue))){
				player.move(1);
				}
			board.getField(player.getLocation()).landOnField(player);	
		}
	break;
		case 15 :{
			player.add(2);
		}
	break;
		case 16 :{
			while(!(board.getField(player.getLocation()).getColor().equals(Color.red))){
				player.move(1);
				}
			board.getField(player.getLocation()).landOnField(player);
		}
	break;
		case 17 :{
			if (player.getLocation() > 10)
				player.add(2);
			player.setLocation(10);
			board.getField(player.getLocation()).landOnField(player);
		}
	break;
		case 18 :{
			while(!(board.getField(player.getLocation()).getColor().equals(Color.magenta) || board.getField(player.getLocation()).getColor().equals(Color.red))){
				player.move(1);
				}
			board.getField(player.getLocation()).landOnField(player);
		}
	break;
		case 19 :{  
			while(!(board.getField(player.getLocation()).getColor().equals(Color.yellow) || board.getField(player.getLocation()).getColor().equals(Color.decode("0x614126")))){
				player.move(1);
				}
			board.getField(player.getLocation()).landOnField(player);
		}
	break;
		}
	}
	
	
	GUI_Field[] fieldsGUI = new GUI_Field[24];
	public void initGUI() {
		fieldsGUI[0] = new GUI_Start("Start", "", "", Color.RED, Color.WHITE);
		fieldsGUI[1] = new GUI_Street("Burgerbaren", "100", "", "100",Color.decode("0x614126"), Color.BLACK);
		fieldsGUI[2] = new GUI_Street("Pizzahytten", "100", "", "100",Color.decode("0x614126"), Color.BLACK);
		fieldsGUI[3] = new GUI_Chance();
		fieldsGUI[4] = new GUI_Street("Slikbutikken", "100", "", "100",Color.CYAN, Color.BLACK);
		fieldsGUI[5] = new GUI_Street("Iskiosken", "100", "", "100",Color.CYAN, Color.BLACK);
		fieldsGUI[6] = new GUI_Jail(); //Fængsel
		fieldsGUI[7] = new GUI_Street("Museet", "200", "", "200",Color.PINK, Color.BLACK);
		fieldsGUI[8] = new GUI_Street("Bilbioteket", "200", "", "200",Color.PINK, Color.BLACK);
		fieldsGUI[9] = new GUI_Chance();
		fieldsGUI[10] = new GUI_Street("Skaterparken", "200", "", "200",Color.ORANGE, Color.BLACK);
		fieldsGUI[11] = new GUI_Street("Swimmingpoolen", "200", "", "200",Color.ORANGE, Color.BLACK);
		fieldsGUI[12] = new GUI_Refuge(); //Gratis parkering
		fieldsGUI[13] = new GUI_Street("Spillehallen", "300", "", "300",Color.RED, Color.BLACK);
		fieldsGUI[14] = new GUI_Street("Biografen", "300", "", "300",Color.RED, Color.BLACK);
		fieldsGUI[15] = new GUI_Chance();
		fieldsGUI[16] = new GUI_Street("Legetøjsbutikken", "300", "", "300",Color.YELLOW, Color.BLACK);
		fieldsGUI[17] = new GUI_Street("Dyrehandlen", "300", "", "300",Color.YELLOW, Color.BLACK);
		fieldsGUI[18] = new GUI_Jail(); //Fængs
		fieldsGUI[19] = new GUI_Street("Bowlinghallen", "400", "", "400",Color.GREEN, Color.BLACK);
		fieldsGUI[20] = new GUI_Street("Zoo", "400", "", "400",Color.GREEN, Color.BLACK);
		fieldsGUI[21] = new GUI_Chance();
		fieldsGUI[22] = new GUI_Street("Vandlandet", "500", "", "500",Color.BLUE, Color.BLACK);
		fieldsGUI[23] = new GUI_Street("Strandpromenaden", "500", "", "500",Color.BLUE, Color.BLACK);
	}
	
	public static void main(String [] args) {
		Controller c = new Controller();
		c.init();
		c.go();
	}
}
