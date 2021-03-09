package inheritance;

public class Person {
	public String name;
	public int age;
	public String job;
	public String pnum;
	
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("번호 : " + pnum);
	}
}
