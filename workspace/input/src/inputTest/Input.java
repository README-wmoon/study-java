package inputTest;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 출력
//		nextInt() : 입력받은 정수
		int addNum1 = 0;
		int addNum2 = 0;
		int addNum3 = 0;
		
		
		Scanner obj = new Scanner(System.in);
		System.out.print("값들: ");
		addNum1 = obj.nextInt();
		addNum2 = obj.nextInt();
		addNum3 = obj.nextInt();
		
		int sum = addNum1+addNum2+addNum3;
		
		System.out.println("값" + sum);
		
	}
}
