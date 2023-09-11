package threadTask;
/*
 * [실습]
동석이네 동물원에는 3마리의 동물이 있다.
각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
나머지 1마리 동물은 2마리 동물이 모두 울고 나면 마지막에 운다.

※ 반드시 join()을 사용한다.
※ 각 동물은 10번씩만 운다.
※ 람다식을 사용한다.
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
