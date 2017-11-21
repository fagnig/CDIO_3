package spil;

import java.util.Random;

public class Dice {
	private int faceValue, t1, t2;
	
	Random dice = new Random(); 
	
	
	public void roll() {
		t1 = dice.nextInt(5)+1;
		t2 = dice.nextInt(5)+1;
		faceValue = t1+t2 ;
	}
	
	public int getFaceValue() {
		return faceValue;
	}
	
	public int[] getFaces(){
		int[] faces = new int[2];
		faces[0] = t1;
		faces[1] = t2;
		return faces;
	}
}
