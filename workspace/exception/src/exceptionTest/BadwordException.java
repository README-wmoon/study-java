package exceptionTest;


// Exception ���: �����Ϸ��� üũ(������ ����), ���������ϱ� �ȴ�!
// RuntimeException ���: �����Ϸ��� üũ���� ����(���� �Ǵ� ��Ÿ�� ����), �������� �ؾ��Ѵ�!

public class BadwordException extends /*RuntimeException*/ Exception {
	public BadwordException(String message) {
		super(message);
	}
}
