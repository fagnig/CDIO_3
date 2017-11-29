package spil;

public class ChanceField extends Field{
	boolean isChance = true;
	public ChanceField(String newText) {
		super(newText);
	}

	public boolean isChance() {
		return isChance;
	}

}
