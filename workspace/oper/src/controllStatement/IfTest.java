package controllStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 정수 대소비교
		int num1 = 0, num2 =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		String result = null;
		
		if(num1 > num2) {
			result = "큰 값 : " + num1;
		
		}else if(num1 != num2) {
			result = "큰 값: " + num2;
		} else {
			result = "두수가 같습니다.";
			
		}
		
		System.out.println(result);
	}
}
