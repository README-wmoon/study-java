package controllStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		�� ���� ��Һ�
		int num1 = 0, num2 =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		String result = null;
		
		if(num1 > num2) {
			result = "ū �� : " + num1;
		
		}else if(num1 != num2) {
			result = "ū ��: " + num2;
		} else {
			result = "�μ��� �����ϴ�.";
			
		}
		
		System.out.println(result);
	}
}
