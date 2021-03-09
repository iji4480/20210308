package struct;

public class StructTest {

	
	public static void getStatus(StructEx ac) {
		
		System.out.println("공격력 : " + ac.atk);
		System.out.println("체력 : " + ac.hp);
		System.out.println("레벨 : " + ac.level);
		System.out.println("아이디 : " + ac.id);
		
	}
	public static void getMagicianStatus(Magician2 ab) {
		
		
	}
	
		
		
	public static void main(String[] args) {
		StructEx w1 = new StructEx();
		
		w1.atk = 3;
		w1.hp = 10;
		w1.level = 1;
		w1.id = "전사";
		getStatus(w1);	
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
}





















