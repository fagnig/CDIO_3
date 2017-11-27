package spil;

import java.awt.Color;

import gui_fields.*;

public class Board {

	private Field[] fields = new Field[24];	
	
	
	public void init() {
		fields[0] = new NeutralField("Start");
		fields[1] = new OwnableField("Burgerbaren", Color.decode("0x614126"), 100);
		fields[2] = new OwnableField("Pizza hutten", Color.decode("0x614126"), 100);
		fields[3] = new ChanceField("CHANCE");
		fields[4] = new OwnableField("Slikbutikken", Color.CYAN, 100);
		fields[5] = new OwnableField("Iskiosken", Color.CYAN, 100);
		fields[6] = new NeutralField("På besøg"); 
		fields[7] = new OwnableField("Museet", Color.PINK, 200);
		fields[8] = new OwnableField("Bibliotekket", Color.PINK, 200);
		fields[9] = new ChanceField("CHANCE");
		fields[10] = new OwnableField("Skaterparken", Color.ORANGE, 200);
		fields[11] = new OwnableField("Swimmingpoolen", Color.ORANGE, 200);
		fields[12] = new NeutralField("Gratis parkering");
		fields[13] = new OwnableField("Spillehallen", Color.RED, 300);
		fields[14] = new OwnableField("Biografen", Color.RED, 300);
		fields[15] = new ChanceField("CHANCE");
		fields[16] = new OwnableField("Legetøjsbutikken", Color.YELLOW, 300);
		fields[17] = new OwnableField("Dyrehandlen", Color.YELLOW, 300);
		fields[18] = new PrisonField("Gå i fængsel");
		fields[19] = new OwnableField("Bowlinghallen", Color.GREEN, 400);
		fields[20] = new OwnableField("ZOO", Color.GREEN, 400);
		fields[21] = new ChanceField("CHANCE");
		fields[22] = new OwnableField("Vandlandet", Color.BLUE, 500);
		fields[23] = new OwnableField("Strandpromenaden", Color.BLUE, 500);
	}

	public Field getField(int id) {
		return fields[id];
	}
}
