package spil;

import java.awt.Color;

public abstract class Field {
	String fieldText;
	Color color;
	int pointMod;
	boolean isOwnable = false;
	boolean isChance = false;
	
	public Field(String newText){
		fieldText = newText;
	}
	
	public abstract void landOnField(Player landingPlayer);
	
	public Color getColor() {
		return color;
	}
}
