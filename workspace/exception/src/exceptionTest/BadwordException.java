package exceptionTest;


// Exception 상속: 컴파일러가 체크(컴파일 오류), 강제종료하기 싫다!
// RuntimeException 상속: 컴파일러가 체크되지 않음(빌드 또는 런타임 오류), 강제종료 해야한다!

public class BadwordException extends /*RuntimeException*/ Exception {
	public BadwordException(String message) {
		super(message);
	}
}
