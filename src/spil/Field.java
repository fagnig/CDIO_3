package spil;

public abstract class Field {
	public class NeutralField {

	}

	String fieldText;
	
	Field(String newText){
		fieldText = newText;
	}
	
	public abstract void landOnField();
}
