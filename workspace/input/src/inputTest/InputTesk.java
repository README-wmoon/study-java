package inputTest;

import java.util.Scanner;

public class InputTesk {
	public static void main(String[] args) {
//		�� ������ �Է� �� �� ���� ��� ���
//		��, next()�� ����Ѵ�.
		int multipleNum1 , multipleNum2;
		Scanner obj = new Scanner(System.in);
		
		System.out.print("�Է��Ͻÿ�: ");
		multipleNum1 = Integer.parseInt(obj.next());
		multipleNum2 = Integer.parseInt(obj.next());
		System.out.println("a ���ϱ� b�� "+ multipleNum1 * multipleNum2);
	}
}
