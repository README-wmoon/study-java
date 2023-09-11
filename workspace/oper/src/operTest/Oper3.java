package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고 
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		예) 183 -> 183 출력
//			183.5 -> 183.5 출력
//			183.0 -> 183 출력
		
		double doubleNum = 0.0;
		int intNum = 0;
		int length = 0;
		boolean isInteger = false;
		String format = null;
		String input = "값 입력 ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(input);
		doubleNum = sc.nextDouble();
		
		length = (doubleNum - (int)doubleNum + "").length() -2;
		isInteger = doubleNum - (int)doubleNum == 0;
		format = isInteger ? "%.0f" : "%." + length + "f";
		
		System.out.printf(format, doubleNum);
		
	}
}
