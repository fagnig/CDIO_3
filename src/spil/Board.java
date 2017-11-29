package spil;

import java.awt.Color;

import gui_fields.*;

public class Board {

	Field[] fields = new Field[24];	
	GUI_Field[] fieldsGUI = new GUI_Field[24];
	
	public void init() {
		fields[0] = new NeutralField("Start");
		fields[1] = new OwnableField("Burgerbaren", Color.decode("0x614126"), 1);
		fields[2] = new OwnableField("Pizza hutten", Color.decode("0x614126"), 1);
		fields[3] = new ChanceField("CHANCE");
		fields[4] = new OwnableField("Slikbutikken", Color.CYAN, 1);
		fields[5] = new OwnableField("Iskiosken", Color.CYAN, 1);
		fields[6] = new NeutralField("På besøg"); 
		fields[7] = new OwnableField("Museet", Color.PINK, 2);
		fields[8] = new OwnableField("Bibliotekket", Color.PINK, 2);
		fields[9] = new ChanceField("CHANCE");
		fields[10] = new OwnableField("Skaterparken", Color.ORANGE, 2);
		fields[11] = new OwnableField("Swimmingpoolen", Color.ORANGE, 2);
		fields[12] = new NeutralField("Gratis parkering");
		fields[13] = new OwnableField("Spillehallen", Color.RED, 3);
		fields[14] = new OwnableField("Biografen", Color.RED, 3);
		fields[15] = new ChanceField("CHANCE");
		fields[16] = new OwnableField("Legetøjsbutikken", Color.YELLOW, 3);
		fields[17] = new OwnableField("Dyrehandlen", Color.YELLOW, 3);
		fields[18] = new PrisonField("Gå i fængsel");
		fields[19] = new OwnableField("Bowlinghallen", Color.GREEN, 4);
		fields[20] = new OwnableField("ZOO", Color.GREEN, 4);
		fields[21] = new ChanceField("CHANCE");
		fields[22] = new OwnableField("Vandlandet", Color.BLUE, 5);
		fields[23] = new OwnableField("Strandpromenaden", Color.BLUE, 5);
	}

	public void initGUI() {
		fieldsGUI[0] = new GUI_Start("Start", "", "", Color.RED, Color.WHITE);
		fieldsGUI[1] = new GUI_Street("Burgerbaren", "1", "", "1",Color.decode("0x614126"), Color.BLACK);
		fieldsGUI[2] = new GUI_Street("Pizzahytten", "1", "", "1",Color.decode("0x614126"), Color.BLACK);
		fieldsGUI[3] = new GUI_Chance();
		fieldsGUI[4] = new GUI_Street("Slikbutikken", "1", "", "1",Color.CYAN, Color.BLACK);
		fieldsGUI[5] = new GUI_Street("Iskiosken", "1", "", "1",Color.CYAN, Color.BLACK);
		fieldsGUI[6] = new GUI_Jail(); //Fængsel
		fieldsGUI[7] = new GUI_Street("Museet", "2", "", "2",Color.PINK, Color.BLACK);
		fieldsGUI[8] = new GUI_Street("Bilbioteket", "2", "", "2",Color.PINK, Color.BLACK);
		fieldsGUI[9] = new GUI_Chance();
		fieldsGUI[10] = new GUI_Street("Skaterparken", "2", "", "2",Color.ORANGE, Color.BLACK);
		fieldsGUI[11] = new GUI_Street("Swimmingpoolen", "2", "", "2",Color.ORANGE, Color.BLACK);
		fieldsGUI[12] = new GUI_Refuge(); //Gratis parkering
		fieldsGUI[13] = new GUI_Street("Spillehallen", "3", "", "3",Color.RED, Color.BLACK);
		fieldsGUI[14] = new GUI_Street("Biografen", "3", "", "3",Color.RED, Color.BLACK);
		fieldsGUI[15] = new GUI_Chance();
		fieldsGUI[16] = new GUI_Street("Legetøjsbutikken", "3", "", "3",Color.YELLOW, Color.BLACK);
		fieldsGUI[17] = new GUI_Street("Dyrehandlen", "3", "", "3",Color.YELLOW, Color.BLACK);
		fieldsGUI[18] = new GUI_Jail(); //Fængs
		fieldsGUI[19] = new GUI_Street("Bowlinghallen", "4", "", "4",Color.GREEN, Color.BLACK);
		fieldsGUI[20] = new GUI_Street("Zoo", "4", "", "4",Color.GREEN, Color.BLACK);
		fieldsGUI[21] = new GUI_Chance();
		fieldsGUI[22] = new GUI_Street("Vandlandet", "5", "", "5",Color.BLUE, Color.BLACK);
		fieldsGUI[23] = new GUI_Street("Strandpromenaden", "5", "", "5",Color.BLUE, Color.BLACK);
	}
}
