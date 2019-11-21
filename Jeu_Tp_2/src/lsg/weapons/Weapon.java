package lsg.weapons;

public class Weapon {
	protected String name;
	protected Integer minDamage;
	protected Integer maxDamage;
	protected Integer stamCost;
	protected Integer durability;
	
	public Weapon(String name, Integer minDamage, Integer maxDamage, Integer stamCost, Integer durability){
		this.name = name;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.stamCost = stamCost;
		this.durability = durability;
	}
	
	//Getter
	
	public String GetName(String name) {
		return this.name;
	}
	public Integer GetMinDamage(Integer minDamage) {
		return this.minDamage;
	}
	public Integer GetMaxDamage(Integer maxDamage) {
		return this.maxDamage;
	}
	public Integer GetStamCost(Integer stamCost) {
		return this.stamCost;
	}
	public Integer GetDurabilty(Integer durabilty) {
		return this.durability;
	}
	
	//Setter
	
	private void SetDurability(Integer durability) {
		this.durability = durability;
	}
	
	//Methods
	
	public void Use() {
		this.durability--;
	}
	
	public boolean IsBroken() {
		if (this.durability <= 0) {
			return true;
		}
		else {
			return false;
		}
	}

}