package Jeu_Tp_1;

public class Monster {
	private String  Name;
	private Integer Life;
	private Integer MaxLife;
	private Integer Stamina;
	private Integer MaxStamina;
	public Integer Instance_Count = 0;
	
	public Monster() {
		this.Name = "Monster_" + Instance_Count + 1;
		this.Life = 10;
		this.MaxLife = 10;
		this.Stamina = 10;
		this.MaxStamina = 10;
	}
}
