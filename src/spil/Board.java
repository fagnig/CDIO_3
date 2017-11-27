package spil;

public class Board {

	Field[] fields = new Field[24];	

	
	public void init() {
		fields[0] = new NeutralField("Start");
		fields[1] = new OwnableField("Burgerbaren", "Brun", 100);
		fields[2] = new OwnableField("Pizza hutten", "Brun", 100);
		fields[3] = new ChanceField("CHANCE");
		fields[4] = new OwnableField("Slikbutikken", "lyseblå", 100);
		fields[5] = new OwnableField("Iskiosken", "lyseblå", 100);
		fields[6] = new NeutralField("På besøg"); 
		fields[7] = new OwnableField("Museet", "Pink", 200);
		fields[8] = new OwnableField("Bibliotekket", "Pink", 200);
		fields[9] = new ChanceField("CHANCE");
		fields[10] = new OwnableField("Skaterparken", "Orange", 200);
		fields[11] = new OwnableField("Swimmingpoolen", "Orange", 200);
		fields[12] = new NeutralField("Gratis parkering");
		fields[13] = new OwnableField("Spillehallen", "Rød", 300);
		fields[14] = new OwnableField("Biografen", "Rød", 300);
		fields[15] = new ChanceField("CHANCE");
		fields[16] = new OwnableField("Legetøjsbutikken", "Gul", 300);
		fields[17] = new OwnableField("Dyrehandlen", "Gul", 300);
		fields[18] = new PrisonField("Gå i fængsel");
		fields[19] = new OwnableField("Bowlinghallen", "Grøn", 400);
		fields[20] = new OwnableField("ZOO", "Grøn", 400);
		fields[21] = new ChanceField("CHANCE");
		fields[22] = new OwnableField("Vandlandet", "Mørkeblå", 500);
		fields[23] = new OwnableField("Strandpromenaden", "Mørkeblå", 500);
 		
	}
}
