package spil;

public class OwnableField extends Field {
	Player owner;
	String color;
	int rent;
	int price;
	
	public OwnableField(String newText, String Color, int newPrice) {
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
