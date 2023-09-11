package staticTest;

class Data {
	int data =10;				// 인스턴스 변수
	
//	모든 객체가 공유해야 할 때 static 필드를 선언한다.
	static int data_s = 10;		//클래스 변수
	
	
	void increase() {
		System.out.println(++data);
	}
	
	void increase_s() {
		System.out.println(++data_s);
	}
}



public class StaticTest {
	public static void main(String[] args) {
		Data data = new Data();				// 이건 전역변수는 얘로 할당됨
											// 하지만 static은 컴파일러로 할당 된다 new 생성자로 할당되지 않는다. -> static은 한개만 만들어진다. -> 왜씀? 
											//	-> 모든 객체가 공유해야될때 쓴다
		
		Data data1 = new Data();
		Data data2 = new Data();
		
		Data.data_s = 20;
		
		data1.data = 30;
		System.out.println(data.data);
		System.out.println(data.data_s);	// static으로 쓴 것이 경고뜸 -> 모든 사람들이 공용으로 써서 객체로 접근하면 안된다.
		System.out.println(Data.data_s);    // 요걸로 써야됨 static은 -> 하나만 써야되기 떄문에 클래스로 호출한다.
		
		
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		
//		data = new Data();
//		
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
		
		
		
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
//		
//		data = new Data();
//		
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
	}
}
