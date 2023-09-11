package inputTest;

import java.util.Scanner;

public class InputTesk {
	public static void main(String[] args) {
//		두 정수를 입력 한 뒤 곱셈 결과 출력
//		단, next()만 사용한다.
		int multipleNum1 , multipleNum2;
		Scanner obj = new Scanner(System.in);
		
		System.out.print("입력하시오: ");
		multipleNum1 = Integer.parseInt(obj.next());
		multipleNum2 = Integer.parseInt(obj.next());
		System.out.println("a 곱하기 b는 "+ multipleNum1 * multipleNum2);
	}
}
