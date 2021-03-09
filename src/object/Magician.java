package object;

public class Magician {

	public int mana;
	public int speed;
	public int age;
	public int level;
	public int hp;
	public int atk;
	public String id;
	
	public Magician(String userId) {
		System.out.println("마법사 아이디 생성중..");
		mana = 50;
		speed = 5;
		age = 18;
		level = 3;
		hp = 100;
		atk = 20;
		id = userId;
		
	} 
	
	
	
	public void getStatus() {
		System.out.println("아이디 : " + id);
		System.out.println("마나 : " + mana);
		System.out.println("속도 : " + speed);
		System.out.println("나이 : " + age);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + atk);
	}
	
	
	
	
	public void huntMonster() {
		System.out.println("사냥시작.");
		hp -= 3;
		level += 1;
		
	}
	
	
	

	public void heal() {
		 System.out.println("치료를 시작합니다.");
		 hp += 3;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
