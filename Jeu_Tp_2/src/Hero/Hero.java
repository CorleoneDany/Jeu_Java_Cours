package Hero;

import Characters.Characters;

//Déclaration de la classe Hero, fille de Characters
public class Hero extends Characters {
	
	public Hero(String name) {
		this.name = name;
		this.stamina = 50;
		this.life = 100;
		this.maxStamina = 50;
		this.maxLife = 100;
		this.PrintStats();
	}
	
	public Hero() {
		this.name = "Gregooninator";
		this.stamina = 50;
		this.life = 100;
		this.maxStamina = 50;
		this.maxLife = 100;
		this.PrintStats();
	}
    	
}
