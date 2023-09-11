package inheritance;

class Human {
	String name;
	
//	기본 생성자는 직접 선언한다.
	public Human() {
		;
	}
	
	public Human(String name) {
		super();
		this.name = name;
	}

	void eat() {
		System.out.println("먹기");
	}
	
	void sleep() {
		System.out.println("자기");
	}
	
	void walk() {
		System.out.println("두 발로 걷기");			// 덮어씌어주어서 주소값이 200으로 override 된다.
	}
}

class Monkey extends Human{
	@Override	// 어노테이션
	void walk() {
		super.walk();								// 덮어씌우어 지기 전에 메소드 주소값은 100
		System.out.println("네 발로 걷는다.");	// 주소값이 200
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Human 한동석 = new Human();
		Monkey kingkong = new Monkey();
		kingkong.walk();
		한동석.walk();
		
	}
}
