package lsg;

public class Monster {
	private String  Name;
	private Integer Life;
	private Integer MaxLife;
	private Integer Stamina;
	private Integer MaxStamina;
	static public Integer Instance_Count = 1;
	
	public Monster() {
		this.Name = "Monster_" + Instance_Count++;
		this.Life = 10;
		this.MaxLife = 10;
		this.Stamina = 10;
		this.MaxStamina = 10;
		PrintStats();
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
        return "[Hero] \t" + this.Name + "\t LIFE: " + this.Life + "\t STAMINA: " + this.Stamina + "\t (" + status + ")";
    }

    public void PrintStats() {
        System.out.println(toString());
    }
}
