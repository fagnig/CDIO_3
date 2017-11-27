package spil;

public class PrisonField extends Field {

	public PrisonField(String newText) {
		super(newText);
	}

	public void landOnField(Player landingPlayer) {
		landingPlayer.setLocation(6);
		landingPlayer.setFree();
	}

}
