package operTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//      심리 테스트
//      
//      Q. 당신이 좋아하는 색을 선택하세요.
//      1. 빨간색
//      2. 노란색
//      3. 검은색
//      4. 흰색
//      
//      빨간색 : 불같고 열정적이고 적극적이다.
//      노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//      검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//      흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		String input = null;
		
		Scanner sc = new Scanner(System.in);
		String name1 = "1. 빨간색";
		String name2 = "2. 노란색";
		String name3 = "3. 검은색";
		String name4 = "4. 흰색";
		System.out.println("당신이 좋아하는 색을 선택하세요");
		input = sc.next();
		
		String result = null;
		
//		result = input == "1" || input =="2" || input =="3" || input =="4" ?  name1   name3 : name4; 
	}
}
