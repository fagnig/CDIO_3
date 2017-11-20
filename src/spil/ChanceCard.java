package spil;

public class ChanceCard {
	static int cardCounter;
	String chanceText;
	int chanceID;
	
	public ChanceCard(String cardText){
		chanceText = cardText;
		chanceID = cardCounter;
		
		cardCounter++;
	}
	
	public void resolveChance(){
		
	}
}
