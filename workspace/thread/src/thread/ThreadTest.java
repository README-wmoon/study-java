package thread;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread1 thread1 = new Thread1("��");
//		Thread1 thread2 = new Thread1("��");
//		Runnable mineral = new Thread2();			// �ַ� runnable�� �ǹ����� ���� ����.
		Runnable mineral = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());			
				try {Thread.sleep(100);} catch (InterruptedException e) {;}
			}
		};	
		
		Thread t1 = new Thread(mineral, "?");
		Thread t2 = new Thread(mineral, "!");
		
		t1.start();
		
//		join�� ����� �����尡 ���� �ǰ� ������ �����尡 ����ȴ�.
//		��, �̹� join()���� start()�� ������� ���� �� ����.
		
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {;}
		
		System.out.println("���ξ�����");
//		join()
//		Scheduling �۾� (single(����) -> ��Ƽ�� �ٲ�)
//		thread1.start();
//		thread2.start();
		
		
//		thread1.run();
//		thread2.run();
	}
}
