package exceptionTest;

import java.util.Iterator;
import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {

//		System.out.println("��                           ��".replace(" ", ""));
//		System.out.println("     ��            ��  ".trim().replace(" ", ""));
		
		
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("�޼���: ");
		message = sc.nextLine();
		
		if(message.equals("�ٺ�")) {
//			���� �߻�
			 try {
				throw new BadwordException("��Ӿ�� ����� �� �����ϴ�.");
			} catch (BadwordException e) {
				for (int i = 0; i < message.length(); i++) {
					System.out.println("*");
				}
				System.out.println();
			}
		}	
	}
}
