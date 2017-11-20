package spil;

import java.awt.Color;

public class Player {
	String name;
	Color color;
	Account account;
	boolean free;
	boolean bankrupt;
	boolean gotCard;
	
	Player(String newName, Color newColor){
		name = newName;
		color = newColor;
		
		account = new Account(30000);
		free = true;
		bankrupt = false;
		gotCard = false;
	}
}
