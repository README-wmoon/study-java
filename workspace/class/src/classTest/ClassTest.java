package classTest;

class A {
	int data;				//전역 변수는 초기화를 하지 않아도 된다 -> 자동으로 초기화가 됨.
	
	A(String name) {		// 매개변수
		System.out.println(name);
	}
	
	A(int data){
		System.out.println(this);
		this.data = data;		//이름을 똑같이 해야 헷갈리지 않는다.
								// 가독성이 높아져야 되서, 동일하게 써야된다. -> 지역변수를 쓰임 으로써 메모리를 효율적으로 써야된다.
	}
	
	void printData() {		// 지역 변수는 무조건 초기화를 해야되는데, 전역변수는 초기화를 하지 않아도 됨
		System.out.println(data);
	}
}


public class ClassTest {
	public static void main(String[] args) {
		A a = new A(10);
		A b = new A(20);
		System.out.println(a);
		System.out.println(b);
//		a.data = 10;
		a.printData();
		b.printData();
	}
}
