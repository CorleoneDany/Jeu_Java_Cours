package Characters;

public class Characters {
	protected String  Name;
	protected Integer Life;
	protected Integer MaxLife;
	protected Integer Stamina;
	protected Integer MaxStamina;
	
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
        return ("[ " + getClass().getSimpleName() + "] \t" + this.Name + "\t LIFE: " + this.Life + "\t STAMINA: " + this.Stamina + "\t (" + status + ")");
    }

    public void PrintStats() {
        System.out.println(toString());
    }

}
