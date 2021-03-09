package polymorph;

public class GameMain {

	public static void main(String[] args) {
		Warrior war1 = new Warrior(20, 3, 1);
		
		
		Orc orc1 = new Orc();
		Orc orc2 = new Orc();
		Dragon d1 = new Dragon();
		Dragon d2 = new Dragon();
		Troll t1 = new Troll();
		Goblin g1 = new Goblin();
		war1.hunt(orc1);
		war1.hunt(orc1);
		
		
		war1.showHp();
		orc1.showHp();
		orc2.showHp();
		g1.showHp();
		t1.showHp();
		
	}
	
}
