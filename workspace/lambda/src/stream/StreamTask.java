package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class StreamTask {
	public int num(int number) {
		return 11 - number;
	}
	
	public boolean Even(int number) {
		return number % 2 == 1;
	}
	
	public boolean odd(int number) {
		return number % 2 == 0;
	}
	
	
	
//	char[] arr = new char[5];							// 배열 안에 캐릭터로 index 5개 담기
//	for(int i=0; i<arr.length; i++) {
//		arr[i] = (char)(i >1 && i < 6? i + 66 : i +65);
//	}
	
	public static void main(String[] args) {
//		10~1까지 ArrayList 담고 출력
//		1~10까지 ArrayList 담고 출력
//		ABCDEF를 각 문자별로 출력
//		1~100까지 중 홀수만 ArrayList에 담고 출력
//		A~F까지 중 D제외하고 ArrayList에 담고 출력
//		5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase() 사용
//		1~100까지 중 짝수만 ArrayList에 담고 출력
//		Apple, banana, Melon 중 첫 번쨰 문자가 대문자인 문자열 출력
//		한글을 정수로 변경
//		정수를 한글로 변경
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		StreamTask streamTask = new StreamTask();
//		10~1까지 ArrayList 담고 출력
//		arrayList.stream().map(streamTask::num).forEach(System.out::println);
		
//		1~10까지 ArrayList 담고 출력
//		IntStream.rangeClosed(1, 10).forEach(arrayList::add);
//		System.out.println(arrayList);
		
//		ABCDEF를 각 문자별로 출력
//		String data =  "ABCDEF";
//		data.chars().forEach(c -> System.out.println((char)c));
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
//		IntStream.rangeClosed(1, 100).filter(streamTask::Even).forEach(arrayList::add);
//		System.out.println(arrayList);
		
//		A~F까지 중 D제외하고 ArrayList에 담고 출력
//		ArrayList<Character> datas = new ArrayList<Character>();
//		IntStream.range(0, 5).map(i -> (i > 2 ? i+1 : i)).forEach(i -> datas.add((char)(i + 65)));
//		System.out.println(datas);
		
//		5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase() 사용
//		ArrayList<String> arrayListS = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		arrayListS.stream().map(String::toLowerCase).forEach(System.out::println);
		
//		1~100까지 중 짝수만 ArrayList에 담고 출력
//		IntStream.rangeClosed(1, 100).filter(streamTask::odd).forEach(arrayList::add);
//		System.out.println(arrayList);
		
//		Apple, banana, Melon 중 첫 번쨰 문자가 대문자인 문자열 출력
//		65 = A 부터 90 = Z
//		ArrayList<String> arrayListS = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		System.out.println(arrayListS.stream().filter(c -> c.charAt(0) >= 65).filter(c -> c.charAt(0) <= 90).collect(Collectors.joining(", ")));
		
//		한글을 정수로 변경
//		String datas = "공일이삼사오육칠팔구십";
//		datas.chars().map(c -> datas.indexOf(c)).forEach(System.out::println);
		
//		정수를 한글로 변경("1024" -> '1' - 48 = 1)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 ");
//		String d = "";
//		d = sc.next();
//		d.chars().map(c -> c - 48).forEach(c -> System.out.print(datas.charAt(c)));
	}
}
