package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް� 
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		��) 183 -> 183 ���
//			183.5 -> 183.5 ���
//			183.0 -> 183 ���
		
		double doubleNum = 0.0;
		int intNum = 0;
		int length = 0;
		boolean isInteger = false;
		String format = null;
		String input = "�� �Է� ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(input);
		doubleNum = sc.nextDouble();
		
		length = (doubleNum - (int)doubleNum + "").length() -2;
		isInteger = doubleNum - (int)doubleNum == 0;
		format = isInteger ? "%.0f" : "%." + length + "f";
		
		System.out.printf(format, doubleNum);
		
	}
}
