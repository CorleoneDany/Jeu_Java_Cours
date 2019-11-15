package Monster;
// Déclaration de la classe Monster
public class Monster {
	private String  Name;
	private Integer Life;
	private Integer MaxLife;
	private Integer Stamina;
	private Integer MaxStamina;
	static public Integer Instance_Count = 1;
	
	public Monster(String MonsterName) {
		this.Name = MonsterName;
		this.Life = 10;
		this.MaxLife = 10;
		this.Stamina = 10;
		this.MaxStamina = 10;
		PrintStats();
	}
	
	public Monster() {
		this.Name = "Monster_" + Instance_Count++;
		this.Life = 10;
		this.MaxLife = 10;
		this.Stamina = 10;
		this.MaxStamina = 10;
		PrintStats();
	}
	
	// Getter
    public String getname() {
        return Name;
    }
    public Integer getlife() {
        return Life;
    }
    public Integer getMaxLife() {
        return MaxLife;
    }
    public Integer getStamina() {
        return Stamina;
    }
    public Integer getMaxStamina() {
        return MaxStamina;
    }

    // Setter
    public Integer setlife() {
        return Life;
    }
    public Integer setMaxLife() {
        return MaxLife;
    }
    public Integer setStamina() {
        return Stamina;
    }
    public Integer setMaxStamina() {
        return MaxStamina;
    }
	
	
	public boolean IsAlive() {
    	if (this.Life > 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	
	@Override
	public String toString() {
        String status = (IsAlive()) ? "ALIVE" : "DEAD";
        return "[Monster] \t" + this.Name + "\t LIFE: " + this.Life + "\t STAMINA: " + this.Stamina + "\t (" + status + ")";
    }

    public void PrintStats() {
        System.out.println(toString());
    }
}
