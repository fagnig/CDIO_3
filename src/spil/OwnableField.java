package spil;

import java.awt.Color;

public class OwnableField extends Field {
	Player owner;
	Color color;
	int rent;
	int price;
	boolean isOwnable = true;
	
	public OwnableField(String newText, Color Color, int newPrice) {
		super(newText);
		color = Color;
		price = newPrice;
		rent = newPrice / 2; //?? 
	}

	public void landOnField(Player landingPlayer) {
		if (owner != null){
			landingPlayer.account.add(-rent);
			owner.account.add(rent);
		}
		else{
			landingPlayer.account.add(-price);
			owner = landingPlayer;
		}
		
	}
	
}
