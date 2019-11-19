package lsg.helpers;

import java.util.Random;

public class Dice {
	protected Integer faces;
	protected java.util.Random random;
	
	public Dice(){
		this.random = new Random();
	}
	
	public Dice(Integer NbOfFaces) {
		this.random  = new Random();
		this.faces = NbOfFaces;
	}
	
	public Integer roll() {
		Integer random_num = random.nextInt(faces);
		//System.out.print(random_num);
		return random_num;	
	}
	
	public String main() {
		String test = "";
		for(Integer i = 0; i < 500; i++) {
			i++;
			test = test + roll() + " ";
		}
		System.out.print(test);
		return test;
	}
}
