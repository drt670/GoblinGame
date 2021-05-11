package mthree;


public class Goblin {

	//health, attack power, defense power
	int health;
	int attackPower; 
	int defensePower;
	
	public Goblin() {
		health = 0;
		attackPower = 0;
		defensePower = 0;
	}
	
	public Goblin (int health, int attackPower, int defensePower) {
		this.health = health;
		this.attackPower = attackPower;
		this.defensePower = defensePower;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public int getDefensePower() {
		return defensePower;
	}

	public void setDefensePower(int defensePower) {
		this.defensePower = defensePower;
	}
	
	
}
