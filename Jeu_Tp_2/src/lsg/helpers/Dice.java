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
		//System.out.println(random_num);
		return random_num;	
	}
	
	public String main() {
		String test = "";
		Integer val_min = 0;
		Integer val_max = 0;
		String[] val_tab;
		for(Integer i = 0; i < 500; i++) {
			i++;
			test = test + roll() + " ";
		}
		val_tab = test.split(" ");
		for(Integer i = 0; i < val_tab.length; i++) {
			if((Integer.parseInt(val_tab[i]) < val_min)) {
				val_min = Integer.parseInt(val_tab[i]);
			}
			else if((Integer.parseInt(val_tab[i]) > val_max)) {
				val_max = Integer.parseInt(val_tab[i]);
			}
		}
		System.out.print(test);
		return test;
	}
}
