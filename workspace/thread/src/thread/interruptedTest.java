package thread;

public class interruptedTest {
	public static void main(String[] args) {
		Thread3 mineral =new Thread3();
		
		Thread thread = new Thread(mineral);
		
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {;}
		
//		thread.interrupt();
//		thread.isInterrupted();
		System.exit(0);
	}
}
