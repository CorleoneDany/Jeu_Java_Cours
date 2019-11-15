package Java_Atelier_2;

public class Hero {
	private String  Name;
	private Integer Life;
	private Integer MaxLife;
	private Integer Stamina;
	private Integer MaxStamina;
	
	public Hero(String HeroName) {
		this.Name = HeroName;
		this.Stamina = 50;
		this.Life = 100;
		this.MaxStamina = 50;
		this.MaxLife = 100;
	}
	
	public Hero() {
		this.Name = "Gregooninator";
		this.Stamina = 50;
		this.Life = 100;
		this.MaxStamina = 50;
		this.MaxLife = 100;
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
    public String setname() {
        return Name;
    }
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
	
    public void PrintStat() {
    	System.out.println("[Hero] \t" + this.Name + "\t Life : " + this.Life + "\t Stamina : " + this.Stamina);
    }
	
}
