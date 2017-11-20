package spil;

import java.awt.Color;

public class Player {
	String name;
	Color color;
	Account account;
	boolean free;
	boolean bankrupt;
	boolean gotCard;
	
	public Player(String newName, Color newColor){
		name = newName;
		color = newColor;
		
		account = new Account(Controller.PLAYER_START_BALANCE);
		free = true;
		bankrupt = false;
		gotCard = false;
	}
}