package inheritance;

class A {
	String name = "A";
	int data =10;
	
	public A() {
		System.out.println("부모 생성자");
	}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A{							//this나 super() 자동 참조가 된다. -> this가 없음 super로 찾아서 됨
	public B() {
		super();							// 부모 생성자 -> 자식 생성자에서 쓰지만 자동으로 생략되어 있는다.(자바에서는) -> c에서는 써야됨 -> 항상 위에 써야됨 
		this.data = 30;
		System.out.println("자식 생성자");
	}
	void printData() {
		System.out.println(data);
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b = new B();
		b.printName();
//		b.data = 20;
		b.printData();
	}
}
