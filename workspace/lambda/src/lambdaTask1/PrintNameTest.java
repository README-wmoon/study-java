/*
 * package lambdaTask1로 선언한다.

	PrintName 인터페이스 선언
	getFullName() 추상 메소드 선언
	- 성과 이름을 전달받느다.

	PrintNameTest 클래스 선언
	printFullName() 메소드 선언
	- 외부에서 구현된 PrintName을 전달받은 뒤 전체 이름을 출력
 */


package lambdaTask1;

public class PrintNameTest {
	public static void main(String[] args) {
		PrintName printFullName = (f, l) -> System.out.println("성: " + f + "\n" + "이름 " + l);
		printFullName.getFullName("문", "우람");
	}
	
}
