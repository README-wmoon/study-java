package thread;

public class Thread3 implements Runnable{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("작업중...");
			if(Thread.currentThread().isInterrupted()) {			//쓰레드를 멈추는 코드가 없을 경우
				break;
			}
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {						//쓰레드를 멈추는 코드가 있을 경우
//				System.out.println("오류 발생됨");
//				break;
//			}
		}
	}
}
