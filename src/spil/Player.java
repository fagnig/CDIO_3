package spil;

import java.awt.Color;

public class Player {
	private String name;
	private Color color;
	private Account account;
	private boolean free;
	private boolean bankrupt;
	private boolean gotCard;
	private int location;
	
	public Player(String newName){
		name = newName;
	
		location = 0;
		account = new Account(Controller.PLAYER_START_BALANCE);
		free = true;
		bankrupt = false;
		gotCard = false;
	}
	
	public void add(int value) {
		account.add(value);
	}
	
	public void setLocation(int newLoc) {
		location = newLoc;
	}
	public void move(int steps) {
		location = (location+steps)%24;
	}
	
	public String getName() {
		return name;
	}

	public int getLocation() {
		return location;
	}
	public boolean getFree() {
		return free;
	}
	public void setFree() {
		if (free == true)
			free = false;
		else free = true;
	}
	public boolean isBankrupt() {
		return bankrupt;
	}

	public void setBankrupt() {
		bankrupt = true;
	}

	public boolean isGotCard() {
		return gotCard;
	}

	public void setGotCard() {
		if (this.gotCard)
			gotCard = false;
		else gotCard = true;
			
	}
	public int getBalance() {
	return account.getBalance();
			}

	public Color getColor() {
		return color;
	}
	
}
