package thread;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread1 thread1 = new Thread1("★");
//		Thread1 thread2 = new Thread1("♥");
//		Runnable mineral = new Thread2();			// 주로 runnable을 실무에서 많이 쓴다.
		Runnable mineral = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());			
				try {Thread.sleep(100);} catch (InterruptedException e) {;}
			}
		};	
		
		Thread t1 = new Thread(mineral, "?");
		Thread t2 = new Thread(mineral, "!");
		
		t1.start();
		
//		join을 사용한 쓰레드가 먼저 되고 나머지 쓰레드가 실행된다.
//		단, 이미 join()전에 start()된 쓰레드는 멈출 수 없다.
		
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {;}
		
		System.out.println("메인쓰레드");
//		join()
//		Scheduling 작업 (single(단일) -> 멀티로 바꿈)
//		thread1.start();
//		thread2.start();
		
		
//		thread1.run();
//		thread2.run();
	}
}
