package spil;

public class Board {

	Field[] fields = new Field[24];	

	
	public void init() {
		fields[0] = new NeutralField("Start");
		fields[1] = new OwnableField("Burgerbaren", "yellow", 100);
		fields[2] = new OwnableField("Pizza hutten", "yellow", 100);
		fields[3] = new ChanceField("CHANCE");
		fields[4] = new OwnableField("Slikbutikken", "blue", 100);
		fields[5] = new OwnableField("Iskiosken", "blue", 100);
		fields[6] = new NeutralField("På besøg"); 
		fields[7] = new OwnableField("Museet", "pink", 200);
		fields[8] = new OwnableField("Bibliotekket", "pink", 200);
		fields[9] = new ChanceField("CHANCE");
		fields[10] = new OwnableField("Skaterparken", "green", 200);
		fields[11] = new OwnableField("Swimmingpoolen", "green", 200);
		fields[12] = new NeutralField("Gratis parkering");
		fields[13] = new OwnableField("Spillehallen", "red", 300);
		fields[14] = new OwnableField("Biografen", "red", 300);
		fields[15] = new ChanceField("CHANCE");
		fields[16] = new OwnableField("Legetøjsbutikken", "magenta", 300);
		fields[17] = new OwnableField("Dyrehandlen", "magenta", 300);
		fields[18] = new NeutralField("Gå i fængsel");
		fields[19] = new OwnableField("Bowlinghallen", "gray", 400);
		fields[20] = new OwnableField("ZOO", "gray", 400);
		fields[21] = new ChanceField("CHANCE");
		fields[22] = new OwnableField("Vandlandet", "cyan", 500);
		fields[23] = new OwnableField("Strandpromenaden", "cyan", 500); 
 		
	}
}
