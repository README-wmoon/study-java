package threadTask;
/*
 * [�ǽ�]
�����̳� ���������� 3������ ������ �ִ�.
�� ������ ���� �Ҹ��� �ٸ��� 2������ ������ ���ÿ� ���.
������ 1���� ������ 2���� ������ ��� ��� ���� �������� ���.

�� �ݵ�� join()�� ����Ѵ�.
�� �� ������ 10������ ���.
�� ���ٽ��� ����Ѵ�.
 */



public class Animal {

	public void makeSound(Runnable runnable) {
		Thread[] threads = null;
		
		Thread thread = new Thread();
		
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(threads[i]);
			} catch (Exception e) {;}
		}
		
	}
}
