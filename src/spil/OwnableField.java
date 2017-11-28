package spil;

import java.awt.Color;

public class OwnableField extends Field {
	Color color;
	boolean isOwnable = true;
	
	public OwnableField(String newText, Color Color, int newPrice) {
		super(newText);
		color = Color;
		price = newPrice;
		rent = newPrice / 2; //?? 
	}
}
