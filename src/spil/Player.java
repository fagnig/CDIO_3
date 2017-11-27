package spil;

import java.awt.Color;

public class Player {
	String name;
	Color color;
	Account account;
	boolean free;
	boolean bankrupt;
	boolean gotCard;
	int location;
	
	public Player(String newName, Color newColor){
		name = newName;
		color = newColor;
		
		location = 0;
		account = new Account(Controller.PLAYER_START_BALANCE);
		free = true;
		bankrupt = false;
		gotCard = false;
	}
	
	public void setLocation(int newLoc) {
		location = newLoc;
	}
	
	public String getName() {
		return name;
	}

	public int getLocation() {
		return location;
	}
}
