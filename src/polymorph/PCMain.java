package polymorph;

public class PCMain {

	public static void getPc(Parent parent) {
		parent.showNum();
		parent.test();
	}
	public static void main(String[] args) {
		// 하단에 child1(Child1타입)
		//child2(Child2타입)
		//parent(Parent타입)을 생성.
		Child1 c1 = new Child1(); //객체
		Child2 c2 = new Child2(); //객체
		Parent p = new Parent(); //객체
		getPc(c2);
	}
}
