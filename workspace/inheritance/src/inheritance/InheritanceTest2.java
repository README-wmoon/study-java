package inheritance;

class Human {
	String name;
	
//	�⺻ �����ڴ� ���� �����Ѵ�.
	public Human() {
		;
	}
	
	public Human(String name) {
		super();
		this.name = name;
	}

	void eat() {
		System.out.println("�Ա�");
	}
	
	void sleep() {
		System.out.println("�ڱ�");
	}
	
	void walk() {
		System.out.println("�� �߷� �ȱ�");			// ������־ �ּҰ��� 200���� override �ȴ�.
	}
}

class Monkey extends Human{
	@Override	// ������̼�
	void walk() {
		super.walk();								// ������ ���� ���� �޼ҵ� �ּҰ��� 100
		System.out.println("�� �߷� �ȴ´�.");	// �ּҰ��� 200
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Human �ѵ��� = new Human();
		Monkey kingkong = new Monkey();
		kingkong.walk();
		�ѵ���.walk();
		
	}
}
