package struct;

public class Magician {
	
	
	public static void getStatus(StructEx se) {
		System.out.println("---캐릭터 정보---");
		System.out.println("레벨 : " + se.level);
		System.out.println("체력 : " + se.hp);
		System.out.println("공격력 : " + se.atk);
		System.out.println("아이디 : " + se.id);
		
		
	}
	

	public static void main(String[] args) {
		
		StructEx m1 = new StructEx();
		
		m1.atk = 20;
		m1.level = 2;
		m1.hp = 50;
		m1.id = "법사";
		getStatus(m1);
		
	}
	
}
