package threadTask;

import thread.Thread1;

/*
 * [�ǽ�]
�����̳� ���������� 3������ ������ �ִ�.
�� ������ ���� �Ҹ��� �ٸ��� 2������ ������ ���ÿ� ���.
������ 1���� ������ 2���� ������ ��� ��� ���� �������� ���.

�� �ݵ�� join()�� ����Ѵ�.
�� �� ������ 10������ ���.
�� ���ٽ��� ����Ѵ�.
 */


public class Zoo {
	public static void main(String[] args) {
		Runnable z1 = () -> {
			for (int i = 0; i < 10; i++) {
				try {Thread.sleep(100);} catch (InterruptedException e) {;}
			}
		};
		
		
		Thread t1 = new Thread(z1);
		Thread t2 = new Thread();
		
		t1.start();
		t2.start();
	}
}
