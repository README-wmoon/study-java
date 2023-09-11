package exceptionTest;

import java.util.Iterator;
import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {

//		System.out.println("안                           녕".replace(" ", ""));
//		System.out.println("     안            녕  ".trim().replace(" ", ""));
		
		
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("메세지: ");
		message = sc.nextLine();
		
		if(message.equals("바보")) {
//			예외 발생
			 try {
				throw new BadwordException("비속어는 사용할 수 없습니다.");
			} catch (BadwordException e) {
				for (int i = 0; i < message.length(); i++) {
					System.out.println("*");
				}
				System.out.println();
			}
		}	
	}
}
