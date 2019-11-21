package Monster;

import Characters.Characters;

// Déclaration de la classe Monster, fille de Characters
public class Monster extends Characters {
	static public Integer nbOfMonster = 1;
	
	public Monster(String name) {
		this.name = name;
		this.life = 10;
		this.maxLife = 10;
		this.stamina = 10;
		this.maxStamina = 10;
		this.PrintStats();
	}
	
	public Monster() {
		this.name = "Monster_" + nbOfMonster++;
		this.life = 10;
		this.maxLife = 10;
		this.stamina = 10;
		this.maxStamina = 10;
		this.PrintStats();
	}
    
}
