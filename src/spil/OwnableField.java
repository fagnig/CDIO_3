package spil;

public class OwnableField extends Field {
	Player owner;
	int rent;
	int price;
	
	public OwnableField(String newText, int newPrice) {
		super(newText);
		price = newPrice;
		rent = newPrice / 2; //??
	}

	public void landOnField(Player landingPlayer) {
		// TODO Auto-generated method stub
		
	}
	
}
