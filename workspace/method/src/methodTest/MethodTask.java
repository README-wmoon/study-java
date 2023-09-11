package methodTest;

import java.util.Scanner;

public class MethodTask {
//	1~10���� println()���� ����ϴ� �޼ҵ�
//	"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
//	�̸��� n�� println()���� ����ϴ� �޼ҵ�
//	�� ������ �������ִ� �޼ҵ�
//	�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
//	1~n������ ���� �����ִ� �޼ҵ�
//	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
//	���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
//	�ѱ��� ������ �ٲ��ִ� �޼ҵ�
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
//	indexOf()2�� ����(���� ���ڿ� ��, ���ڿ��� ����� ��) ����� (������׿� ���� �ִ��� �˾Ƴ��ִ� ��) 
	
	void printNum() {
		int number = 0;
		for(int i=0; i < 10; i++) {
			number = i + 1;
			System.out.println( number + ".");
		}
	}
	void printName() {
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� ����: ");
		count = sc.nextInt();
		for(int i=0; i<count; i++) {
			System.out.println("ȫ�浿");
		}
	}
	
	void printNumName() {
		String name;
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� ����: ");
		count = sc.nextInt();
		System.out.print("�̸� �Է�: ");
		name = sc.next();
		for(int i=0; i<count; i++) {
			System.out.println(name);
		}
	}
	int subNum(int num1, int num2, int num3) {
		int sum = 0;
		sum = num1 - num2 - num3;
		
		System.out.println(sum);
		return sum;
	}
	
//	�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
	void divideNum(int num1, int num2) {
		int value = 0;
		int remainder = 0;
		value = num1 / num2;
		remainder = num1 % num2;
		System.out.println("����: " + value);
		System.out.println("��������: " + remainder);
		
	}
	
//	����
	int[] div(int num1, int num2) {
		int[] result =null;
		if(num2 != 0) {
			result = new int[2];
			result[0] = num1 / num2;
			result[1] = num1 % num2;
		}
		
		return result;
	}
	
//	1~n������ ���� �����ִ� �޼ҵ�
	void addNum() {
		int sum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���Է�: ");
		count = sc.nextInt();
		for(int i=0; i<count; i++) {
			sum = sum + i + 1;
		}
		System.out.println(sum);
	}
	
//	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�	
//	����
	int change(int number) {
		return ++number;
	}
//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
	String inputStr() {
		String input = "";
		String answer = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		input = sc.next();
		for(char s : input.toCharArray()) {
			answer += Character.isUpperCase(s) ? 
					Character.toLowerCase(s) : Character.toUpperCase(s);
		}
		System.out.println(answer);
			
		return answer;
	}
	
//	����
	String changeString(String string) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if(c >=65 && c <=90) {
				result += (char)(c+32);
			}else if(c >=97 && c <= 122) {
				result += (char)(c-32);
			} else {
				result += c;
			}
		}
		return result;
	}
	
//	���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
//  ����
	int getCount(String string, char target) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if(c == target) {
				count++;
			}
		}
		return count;
	}
//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
//	����
	int getValue(int[] arData, int index) {
		return arData[index];
	}
//	�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
//	����
	int changeToInteger(String hangle) {
		String hangleOriginal = "�����̻�����ĥ�ȱ�";
		String result ="";
		for (int i = 0; i < hangle.length(); i++) {
			result += hangleOriginal.indexOf(hangle.charAt(i));			
		}
		
		return Integer.parseInt(result);
	}
	
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
	String numberInput() {
		String answer = "";
		int num[] = new int[5];				
		int max =-9999 ,min = 9999;			//�Է¹޴� ������ �۰ų� ū �� �ʱⰪ ����
		String ex = "5���� ������ �Է��Ͻÿ�: ";
		String maxNum ="�ִ밪: ";
		String minNum ="�ּҰ�: ";
		Scanner sc = new Scanner(System.in);
		System.out.println(ex);
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if(max<num[i]) {
				max=num[i];
			}
			if(min >= num[i]) {
				min=num[i];
			}
		}
		answer ="�ִ밪: " + max + " " +"�ּҰ�:" + min;
		System.out.println(answer);
		return answer;
	}
//	����
	int[] getMaxAndMin(int[] arData) {
		int[] results = new int[2];
		results[0] = arData[0];
		results[1] = arData[0];
		
		for (int i = 0; i < arData.length; i++) {
			if(results[0] < arData[i]) {{results[0] = arData[i];}}
			if(results[1] < arData[i]) {{results[1] = arData[i];}}
		}
		
		return results;
	}
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
	void numberInputs() {
		int num[] = new int[5];				
		int max =-9999 ,min = 9999;			//�Է¹޴� ������ �۰ų� ū �� �ʱⰪ ����
		String ex = "5���� ������ �Է��Ͻÿ�: ";
		String maxNum ="�ִ밪: ";
		String minNum ="�ּҰ�: ";
		Scanner sc = new Scanner(System.in);
		System.out.println(ex);
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if(max<num[i]) {
				max=num[i];
			}
			if(min >= num[i]) {
				min=num[i];
			}
		}
		
		System.out.println(maxNum + max);
		System.out.println(minNum + min);
	}
	
//	����
	void getMaxAndMin(int[] arData, int[] results) {
		results[0] = arData[0];
		results[1] = arData[0];
		
		for (int i = 0; i < arData.length; i++) {
			if(results[0] < arData[i]) {{results[0] = arData[i];}}
			if(results[1] < arData[i]) {{results[1] = arData[i];}}
		}
	}
//	indexOf()2�� ����(���� ���ڿ� ��, ���ڿ��� ����� ��) ����� (������׿� ���� �ִ��� �˾Ƴ��ִ� ��)
//	����
	int indexOf(String string, char target) {
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			
			if(c == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		MethodTask t1 = new MethodTask();
		t1.numberInputs();
	}
}
