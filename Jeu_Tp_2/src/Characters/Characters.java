package Characters;

public class Characters {
	protected String  name;
	protected Integer life;
	protected Integer maxLife;
	protected Integer stamina;
	protected Integer maxStamina;
	
	// Getter
    public String getname() {
        return name;
    }
    public Integer getlife() {
        return life;
    }
    public Integer getmaxLife() {
        return maxLife;
    }
    public Integer getstamina() {
        return stamina;
    }
    public Integer getmaxStamina() {
        return maxStamina;
    }

    // Setter
    public Integer setlife() {
        return life;
    }
    public Integer setmaxLife() {
        return maxLife;
    }
    public Integer setstamina() {
        return stamina;
    }
    public Integer setmaxStamina() {
        return maxStamina;
    }
    
	public boolean IsAlive() {
    	if (this.life > 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	
    @Override
    public String toString() {
        String status = (IsAlive()) ? "ALIVE" : "DEAD";
        String result = String.format("%-20s%-20s%-20s%-20s", "[" + getClass().getSimpleName() + "]", name, "life: " + life, "stamina: " + stamina, "(" + status + ")");
        return result; 
    }

    public void PrintStats() {
        System.out.println(toString());
    }

}
