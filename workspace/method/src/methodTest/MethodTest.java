package methodTest;

public class MethodTest {
//	f(x)=2x+1
	/*static*/ int f(int x){
		int result = 2*x+1;
		return result;
	}
	
//	static
//	컴파일러가 가장 먼저 메모리에 할당해준다.
//	일반 메소드를 static 메소드에서 사용하기 위해서는 아래의 두 가지 방법이 존재한다.
//	1. 일반 메소드에 static을 작성하여 같은 시간대에 메모리로 올려준다.
//	2. 일반 메소드의 소속을 알려준다. - 무조건 2번으로 써야됨
	
//	***staic도 heap, new 도 heap에 저장되니 같이 할수 있다 -> static을 안써도 됨
	
	
	public static void main(String[] args) {
		MethodTest methodTest = new MethodTest();				// 요렇게 써야됨.
		methodTest.f(3);
//		f(3);
	}
}
