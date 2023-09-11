package methodTest;

import java.util.Scanner;

public class MethodTask {
//	1~10까지 println()으로 출력하는 메소드
//	"홍길동"을 n번 println()으로 출력하는 메소드
//	이름을 n번 println()으로 출력하는 메소드
//	세 정수를 뺄셈해주는 메소드
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//	1~n까지의 합을 구해주는 메소드
//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
//	한글을 정수로 바꿔주는 메소드
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
//	indexOf()2개 전달(전달 문자열 값, 문자열의 몇번쨰 값) 만들기 (몇번쨰항에 값이 있는지 알아내주는 것) 
	
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
		System.out.print("입력 갯수: ");
		count = sc.nextInt();
		for(int i=0; i<count; i++) {
			System.out.println("홍길동");
		}
	}
	
	void printNumName() {
		String name;
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 갯수: ");
		count = sc.nextInt();
		System.out.print("이름 입력: ");
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
	
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
	void divideNum(int num1, int num2) {
		int value = 0;
		int remainder = 0;
		value = num1 / num2;
		remainder = num1 % num2;
		System.out.println("몫은: " + value);
		System.out.println("나머지는: " + remainder);
		
	}
	
//	강사
	int[] div(int num1, int num2) {
		int[] result =null;
		if(num2 != 0) {
			result = new int[2];
			result[0] = num1 / num2;
			result[1] = num1 % num2;
		}
		
		return result;
	}
	
//	1~n까지의 합을 구해주는 메소드
	void addNum() {
		int sum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("합입력: ");
		count = sc.nextInt();
		for(int i=0; i<count; i++) {
			sum = sum + i + 1;
		}
		System.out.println(sum);
	}
	
//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드	
//	강사
	int change(int number) {
		return ++number;
	}
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String inputStr() {
		String input = "";
		String answer = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		input = sc.next();
		for(char s : input.toCharArray()) {
			answer += Character.isUpperCase(s) ? 
					Character.toLowerCase(s) : Character.toUpperCase(s);
		}
		System.out.println(answer);
			
		return answer;
	}
	
//	강사
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
	
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//  강사
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
//	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
//	강사
	int getValue(int[] arData, int index) {
		return arData[index];
	}
//	한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
//	강사
	int changeToInteger(String hangle) {
		String hangleOriginal = "공일이삼사오육칠팔구";
		String result ="";
		for (int i = 0; i < hangle.length(); i++) {
			result += hangleOriginal.indexOf(hangle.charAt(i));			
		}
		
		return Integer.parseInt(result);
	}
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	String numberInput() {
		String answer = "";
		int num[] = new int[5];				
		int max =-9999 ,min = 9999;			//입력받는 값보다 작거나 큰 수 초기값 설정
		String ex = "5개의 정수를 입력하시오: ";
		String maxNum ="최대값: ";
		String minNum ="최소값: ";
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
		answer ="최대값: " + max + " " +"최소값:" + min;
		System.out.println(answer);
		return answer;
	}
//	강사
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
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
	void numberInputs() {
		int num[] = new int[5];				
		int max =-9999 ,min = 9999;			//입력받는 값보다 작거나 큰 수 초기값 설정
		String ex = "5개의 정수를 입력하시오: ";
		String maxNum ="최대값: ";
		String minNum ="최소값: ";
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
	
//	강사
	void getMaxAndMin(int[] arData, int[] results) {
		results[0] = arData[0];
		results[1] = arData[0];
		
		for (int i = 0; i < arData.length; i++) {
			if(results[0] < arData[i]) {{results[0] = arData[i];}}
			if(results[1] < arData[i]) {{results[1] = arData[i];}}
		}
	}
//	indexOf()2개 전달(전달 문자열 값, 문자열의 몇번쨰 값) 만들기 (몇번쨰항에 값이 있는지 알아내주는 것)
//	강사
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
