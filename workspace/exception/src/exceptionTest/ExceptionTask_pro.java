package exceptionTest;

import java.util.Scanner;

public class ExceptionTask_pro {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String msg ="입력하기";
		String input = "";
		boolean flag = false;
		int[] count = new int[5];
		
		for (int i = 0; ; i++) {
			System.out.println(i + 1 + "번쨰");
			input = sc.next();
			if(input.toLowerCase().equals("q")) {break;}
			
			try {
				count[i] = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력해주세요.");
				i--;
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개의 정수만 입력이 가능");
				for (int j = 0; j < count.length; j++) {
					System.out.println(count[j] + " ");
				}
				
				break;
			}catch (Exception e) {
				System.out.println("다시 시도해주세요");
			}
			
			
		}
	}
}
