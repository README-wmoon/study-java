package inputTest;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
//		3���� ������ �� ���� �Է¹��� �� ���� ���
//		nextInt() : �Է¹��� ����
		int addNum1 = 0;
		int addNum2 = 0;
		int addNum3 = 0;
		
		
		Scanner obj = new Scanner(System.in);
		System.out.print("����: ");
		addNum1 = obj.nextInt();
		addNum2 = obj.nextInt();
		addNum3 = obj.nextInt();
		
		int sum = addNum1+addNum2+addNum3;
		
		System.out.println("��" + sum);
		
	}
}
