package spil;

public class ChanceField extends Field{
	boolean isChance = true;
	public ChanceField(String newText) {
		super(newText);
	}

	@Override
	public void landOnField(Player landingPlayer) {
	}

}
