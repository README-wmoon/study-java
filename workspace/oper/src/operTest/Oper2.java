package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		�� ���� ��Һ�
		int num1 = 0, num2 =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		String result = null;
		
		
		result = num1 > num2 ? "ū ��: " + num1 
				: num1 == num2 ? "�� ���� �����ϴ�" : "ū ��" + num2;
		
		System.out.println("ū �� : " + result);
	}
}
