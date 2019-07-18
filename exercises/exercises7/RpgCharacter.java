package exercises7;

public class RpgCharacter {  //Constructor
	
	private int hitPoints, atk, def, skill, luck;
	
	/**
	 * HP: Health Character has
	 * Attack: How much damage character does when fighting
	 * Defense: How much damage a character can resist
	 * Skill: Determines hit rate
	 * Luck: Determines chance that a stat will gain a point on level up. Also contributes slightly to better hit rate
	 */
	
	//Sets Base Stats (Can't be over 17)
	public RpgCharacter(int hp, int atk, int def, int skl, int lck, boolean firstch) {
		if(hp + atk + def + skl + lck > 17 && firstch == true) {
		this.hitPoints = hp;
		this.atk = atk;
		this.def = def;		
		this.skill = skl;
		this.luck = lck;
		firstch == false;
		}
		else {
			throw new Error("Error: Cannot have a Base Stat Total over 14");
		}
	}
	
	public void defesne(int oppAtt) {
		if(oppAtt > this.def) {
			this.hitPoints = oppAtt - this.def;
		}
	}
	
	public void levelUp(boolean levelup) {
		
		if(levelup = true) {
			if(Math.random() < .1 + (this.luck/100)*2) {
				this.hitPoints += 1;
			}
			if(Math.random() < .1 + (this.luck/100)*2) {
				this.atk += 1;
			}
			if(Math.random() < .1 + (this.luck/100)*2) {
				this.def += 1;
			}
			if(Math.random() < .1 + (this.luck/100)*2) {
				this.skill += 1;
			}
			if(Math.random() < .1 + (this.luck/100)*2) {
				this.luck += 1;
			}
		}
	
	}
	//Outputs Boolean if character is able to attack
	public void Attack(int oppDef, int oppHp) {
		if(this.atk > oppDef) {
			oppHp -= this.atk - oppDef;
		}
		
	}
	
	public int [] getStats(){
		int [] stats =  {this.hitPoints, this.atk, this.def, this.skill, this.luck};
		return stats;
	}
}


