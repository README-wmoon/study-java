package exceptionTest;

import java.util.Scanner;

//		5���� ������ �Է� �ޱ�
//		-���� �Է� ���·� ����
//		- q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� ���� ����ϱ�

public class ExceptionTask {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String msg ="�Է��ϱ�";
		String input = "";
		boolean flag = false;
		char[] count = new char[5];
		
		System.out.println(msg);
		
		
		while(flag == false) {
			input = sc.next();
			
			
			
			if(input.equals("q")) {
				for (int i = 0;  input.length() < 5; i++) {
					try {
						System.out.println(count = input.toCharArray());
					} catch (Exception e) {
						System.out.println("����");
						System.out.println(count[i]);
					}
				}
				flag = true;
			}
			
		}
		
	}
}
