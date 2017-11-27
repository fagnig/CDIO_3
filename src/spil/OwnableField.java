package spil;

import java.awt.Color;

public class OwnableField extends Field {
	private Player owner;
	private	Color color;
	private int rent;
	private int price;
	private boolean isOwnable = true;
	
	public OwnableField(String newText, Color Color, int newPrice) {
		super(newText);
		color = Color;
		price = newPrice;
		rent = newPrice / 2; //?? 
	}

	public void landOnField(Player landingPlayer) {
		if (owner != null){
			landingPlayer.add(-rent);
			owner.add(rent);
		}
		else{
			landingPlayer.add(-price);
			owner = landingPlayer;
		}
		
	}
	public Color getColor() {
		return color;

	}

}
