package lsg.helpers;

import java.util.List;
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
		//System.out.println(random_num);
		return random_num;	
	}
	
	public void main() {
		Integer val_min = 25;
		Integer val_max = 25;
		Integer val;
		for(Integer i = 0; i < 500; i++) {
			val = roll();
			System.out.print(val + " ");
			if(val < val_min) {
				val_min = val;
			}
			else if(val > val_max) {
				val_max = val;
			}
		}
		System.out.println("\rVal max : " + val_max);
		System.out.println("Val min : " + val_min);
	}
}
