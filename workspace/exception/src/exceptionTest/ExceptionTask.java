package exceptionTest;

import java.util.Scanner;

//		5개의 정수만 입력 받기
//		-무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 각 정수는 배열에 담기
//		- if문은 딱 한 번만 사용하기

public class ExceptionTask {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String msg ="입력하기";
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
						System.out.println("값은");
						System.out.println(count[i]);
					}
				}
				flag = true;
			}
			
		}
		
	}
}
