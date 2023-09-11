package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		두 정수 대소비교
		int num1 = 0, num2 =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		String result = null;
		
		
		result = num1 > num2 ? "큰 값: " + num1 
				: num1 == num2 ? "두 수는 같습니다" : "큰 값" + num2;
		
		System.out.println("큰 값 : " + result);
	}
}
