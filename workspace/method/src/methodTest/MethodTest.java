package methodTest;

public class MethodTest {
//	f(x)=2x+1
	/*static*/ int f(int x){
		int result = 2*x+1;
		return result;
	}
	
//	static
//	�����Ϸ��� ���� ���� �޸𸮿� �Ҵ����ش�.
//	�Ϲ� �޼ҵ带 static �޼ҵ忡�� ����ϱ� ���ؼ��� �Ʒ��� �� ���� ����� �����Ѵ�.
//	1. �Ϲ� �޼ҵ忡 static�� �ۼ��Ͽ� ���� �ð��뿡 �޸𸮷� �÷��ش�.
//	2. �Ϲ� �޼ҵ��� �Ҽ��� �˷��ش�. - ������ 2������ ��ߵ�
	
//	***staic�� heap, new �� heap�� ����Ǵ� ���� �Ҽ� �ִ� -> static�� �Ƚᵵ ��
	
	
	public static void main(String[] args) {
		MethodTest methodTest = new MethodTest();				// �䷸�� ��ߵ�.
		methodTest.f(3);
//		f(3);
	}
}