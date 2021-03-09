package inheritance;

public class Main extends Person {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.name = "정우원";
		std.age = 23;
		std.job = "학생";
		std.grade = 3;
		std.major = "정보통신";
		std.pnum = "010-8898-4845";
		std.setGrade(4);
		std.getInfo("------------------------------");
		SalaryMan sm = new SalaryMan();
		sm.name = "이말련";
		sm.age = 35;
		sm.job = "개발자";
		sm.pnum = "011-2323-3432";
		sm.sal = 5000;
		
		sm.getInfo();
		
	}//main
	
}//class
