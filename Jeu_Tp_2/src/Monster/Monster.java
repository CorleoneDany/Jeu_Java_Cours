package Monster;

import Characters.Characters;

// Déclaration de la classe Monster, fille de Characters
public class Monster extends Characters {
	static public Integer Instance_Count = 1;
	
	public Monster(String MonsterName) {
		this.Name = MonsterName;
		this.Life = 10;
		this.MaxLife = 10;
		this.Stamina = 10;
		this.MaxStamina = 10;
		this.PrintStats();
	}
	
	public Monster() {
		this.Name = "Monster_" + Instance_Count++;
		this.Life = 10;
		this.MaxLife = 10;
		this.Stamina = 10;
		this.MaxStamina = 10;
		this.PrintStats();
	}
    
}
