package lambdaTask1;

import java.util.Scanner;

/*
 * [��ȭ �ǽ�]
���� ���� ������ �Է¹޾Ƽ� �˸´� ����, ���� ����� Ȯ���ϴ� ���ø����̼� ����

�Է� ��1) 7 + 35 - 9
��� ��1) 33

�Է� ��2) -9 + 8 + 10
��� ��2) 9

* "ABC".split("")�� [A][B][C] 3ĭ ���ڿ� �迭�� ���ϵȴ�.
   "A,B,C".split(",")�� [A][B][C] 3ĭ ���ڿ� �迭�� ���ϵȴ�.
   split("������")�� �����ϸ� ���ڿ����� ������ �������� �������� ���ڿ� ���� �߶� �� ���ڿ� �迭�� �����Ѵ�.
   �������� ���� �� ����� ������ split("������|������")���� ����ϸ�, "+", "-"�� ���������� ����� ������ "\\+", "\\-"�� ǥ���Ѵ�.
   ��)"4 + 9".split("\\+")�� [4][9] 2ĭ ���ڿ� �迭�� ����

* ����ڰ� ���������θ� �Է��Ѵٴ� ���� �Ͽ� �����ϵ��� �Ѵ�.
* �� ������ ���޹��� �� int�� �����ϴ� calc �߻�޼ҵ� ����(�Լ��� �������̽� ����) - Calc
* �� ������ ����, ������ �����ִ� �Լ��� �������̽��� �����ϴ� static �޼ҵ� ����(���ٽ� ����)
* ��ü ���� ���޹��� �� String[]�� �����ϴ� getOpers �߻�޼ҵ� ����(�Լ��� �������̽� ����) - OperCheck
* main�޼ҵ忡 getOper�� ���ٽ����� ���� - MyMath(���� �޼ҵ� ����)
* ù��° ������ ������ ��� ���� �ذ�
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
		String message = "������ ����, �E���� ���� ���� �Է��Ͻÿ�..";
		String exampleMessage = "��)9+7-5";
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
