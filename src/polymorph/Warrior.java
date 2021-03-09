package polymorph;

public class Warrior {
	
	private int hp;
	private int atk;
	private int def;
	
	public Warrior (int hp, int atk, int def) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public void hunt(Monster monster) {
		int result = monster.getHp() - this.atk;
		monster.setHp(result);
		
	}
	
	public void showHp() {
		System.out.println("전사의 체력 : " + this.hp);
	}
	
	
}
