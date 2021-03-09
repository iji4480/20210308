package object;

public class AcTest {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("친절한 이웃 거미");		
		w1.getStatus();
		w1.huntMonster();
		w1.heal();
		w1.getStatus();
		
		
		System.out.println("-------------------");
		
		
		Magician m1 = new Magician("바수니");
		
		m1.huntMonster();
		m1.getStatus();
		m1.heal();
		m1.getStatus();
	}

	
	
}
