package spil;

public class Language {
	public static String replay() {
		return "Start et nyt spil?";
	}

	public static String replayConfirm() {
		return "Ja";
	}
	
	public static String replayDecline() {
		return "Nej";
	}
	
	public static String playerWon(String name) {
		return "Spilleren " + name + " vandt spillet!";
	}

	public static String playerCount() {
		return "Hvor mange spillere?";
	}

	public static String playerNameEntry(int i) {
		return "Spiller "+i+" indtast dit navn";
	}

	public static String newTurn(String name) {
		return "Det er "+name+"'s tur";
	}

	public static String diceRoll() {
		return "Rul med terningen mester!";
	}
}
