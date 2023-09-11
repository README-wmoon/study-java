package lambdaTask1;

import java.util.Scanner;

/*
 * [심화 실습]
여러 개의 정수를 입력받아서 알맞는 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작

입력 예1) 7 + 35 - 9
출력 예1) 33

입력 예2) -9 + 8 + 10
출력 예2) 9

* "ABC".split("")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
   "A,B,C".split(",")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
   split("구분점")을 전달하면 문자열에서 동일한 구분점을 기준으로 문자열 값을 잘라낸 후 문자열 배열로 리턴한다.
   구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
   예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴

* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작) - Calc
* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작) - OperCheck
* main메소드에 getOper를 람다식으로 구현 - MyMath(메인 메소드 선언)
* 첫번째 정수가 음수일 경우 오류 해결
 */


public class MyMath_pro {
	public static Calc operate(String oper) {
		Calc calc = null;
		
		return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
		
//		switch (oper) {
//		case "+":
//			calc = (num1, num2) -> num1 + num2; 
//			break;
//		case "-":
//			calc = (num1, num2) -> num1 - num2;
//			break;
//		}
//		
//		return calc;
	}
	
	public static void main(String[] args) {
		OperCheck operCheck = e -> {
			String result = "";
			for (int i = 0; i < e.length(); i++) {
				char c = e.charAt(i);
				
				if(c == '-' || c == '+') {
					result += c;
				}
			}
			return result.split("");
		};
		String message = "정수의 덧셈, 뺼셈에 대한 식을 입력하시오..";
		String exampleMessage = "예)9+7-5";
		String expression = null;
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		
		System.out.println(message);
		System.out.println(exampleMessage);
		expression = sc.nextLine();
		String[] opers = null;
		String[] numbers = null;
		
		
		opers = operCheck.getOpers(expression);
		numbers = expression.split("\\+|\\-");
		number1 = Integer.parseInt(numbers[0].equals("")? opers[0] + numbers[1] : numbers[0]);
		
		for (int i = 0; i < opers.length; i++) {
			number2 = Integer.parseInt(numbers[i+1]);
			number1 = MyMath_pro.operate(opers[i]).calc(number1, number2);
		}
		
		System.out.println(number1);
	}
	
}
