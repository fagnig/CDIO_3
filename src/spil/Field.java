package spil;

public abstract class Field {
	String fieldText;
	String color;
	int pointMod;
	
	public Field(String newText){
		fieldText = newText;
	}
	
	public abstract void landOnField(Player landingPlayer);
}
