package spil;

public abstract class Field {
	String fieldText;
	
	public Field(String newText){
		fieldText = newText;
	}
	
	public abstract void landOnField(Player landingPlayer);
}
