package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		�͸�Ŭ������ ����ϰų� ���ٽ��� ����ϴ� �Ϳ� �־ ���� ������ ���� ���̰� ����.
//		�׷��⿡ �� ������ ���ٸ� ��ȣ�Ѵ�.
		
//		LambdaInter lambdaInter = new LambdaInter() {
//			
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				// TODO Auto-generated method stub
//				return number % 10 ==0;
//			}
//		};
//		
		LambdaInter lambdaInter = k -> k % 10 == 0;
		System.out.println(lambdaInter.checkMultipleOf10(20));
	}
}
