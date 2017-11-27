package spil;

public class ChanceCard {
	private static int cardCounter = 0;
	private String chanceText;
	private int chanceID;
	
	public ChanceCard(String cardText){
		chanceText = cardText;
		chanceID = cardCounter;
		
		cardCounter++;
	}
	
	public int getID() {
		return chanceID;
	}

}
