package object;

public class Warrior {

	public String name;
	public int age;
	public int hp;
	public int level;
	public int speed;
	public int atk;
	public String id;
	
	
	//class이름과 같은경우 리턴 타입(void)을 생략해도 된다.
	//생성자는 객체를 생성할때 한번만 호출 됨.
	public Warrior(String userId) {
		System.out.println("전사 아이디 생성중");
		level = 1;
		hp = 30;
		atk = 13;
		id = userId;
	}
	
	
	public void getStatus() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + hp);
		System.out.println("레벨 : " + level);
		System.out.println("나이 : " + age);
		System.out.println("속도 : " + speed);
		System.out.println("공격력 : " + atk);
	}
	
	public void huntMonster() {
		System.out.println("사냥시작.");
		hp -= 3;
		level += 1;
		
	}
	
	public void heal() {
		System.out.println("치료시작");
		hp = 100;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
