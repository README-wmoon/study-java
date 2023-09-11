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


public class MyMath {
//	�� ������ ����, �E���� �����ִ� �Լ�
//	static �޼ҵ� ����
	public static Calc calCul(String oper) {
		Calc cal = null;
		switch (oper) {
		case "+":
			cal = (num1, num2) -> num1 + num2; 
			break;
		case "-":
			cal = (num1, num2) -> num1 - num2;
			break;
		}
		
		return cal;
	}
	
	public static void main(String[] args) {
		String msg = "���� �Է��Ͻÿ�";									// 4+6 �䷸�� ����
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String[] nums = null;
		String[] opers = null;
		
		
		OperCheck operCheck = (r) -> {						// OperCheck�� ���ٽ� �����ϴ°�
			String temp = "";					
			for(int i=0; i<r.length(); i++) {
				char c = r.charAt(i);
				
				if(c == 43 || c == 45) {					// 43 = + 45 = -
					temp = temp + c;
				}
				
			}
			return temp.split("");							
		};
		String input = null;
		System.out.println(msg);
		input = sc.next();
		
		
		nums = input.split("\\+|\\-");
		opers = operCheck.getOpers(input);
		num1 = Integer.parseInt(nums[0].equals("")? opers[0] + nums[1] : nums[0]);
		for (int j = 0; j < opers.length; j++) {
			if(num1 < 0 && j== 0) {
				continue;
			}
			num2 = Integer.parseInt(nums[j+ 1]);
			num1 = calCul(opers[j]).calc(num1, num2);
		}
		
		System.out.println(num1);
	}
	
}
