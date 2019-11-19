package Hero;

import Characters.Characters;

//Déclaration de la classe Hero, fille de Characters
public class Hero extends Characters {
	
	public Hero(String HeroName) {
		this.Name = HeroName;
		this.Stamina = 50;
		this.Life = 100;
		this.MaxStamina = 50;
		this.MaxLife = 100;
		this.PrintStats();
	}
	
	public Hero() {
		this.Name = "Gregooninator";
		this.Stamina = 50;
		this.Life = 100;
		this.MaxStamina = 50;
		this.MaxLife = 100;
		this.PrintStats();
	}
    	
}
