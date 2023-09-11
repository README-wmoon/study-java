package threadTask;

import thread.Thread1;

/*
 * [실습]
동석이네 동물원에는 3마리의 동물이 있다.
각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
나머지 1마리 동물은 2마리 동물이 모두 울고 나면 마지막에 운다.

※ 반드시 join()을 사용한다.
※ 각 동물은 10번씩만 운다.
※ 람다식을 사용한다.
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
