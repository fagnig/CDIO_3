package spil;

import java.awt.Color;

public abstract class Field {
	Player owner;
	String fieldText;
	Color color;
	int rent;
	int price;
	boolean isOwned = false;
	boolean isOwnable = false;
	boolean isChance = false;
	
	public Field(String newText){
		fieldText = newText;
	}
}
