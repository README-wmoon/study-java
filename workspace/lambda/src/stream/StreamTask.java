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
	
	
	
//	char[] arr = new char[5];							// �迭 �ȿ� ĳ���ͷ� index 5�� ���
//	for(int i=0; i<arr.length; i++) {
//		arr[i] = (char)(i >1 && i < 6? i + 66 : i +65);
//	}
	
	public static void main(String[] args) {
//		10~1���� ArrayList ��� ���
//		1~10���� ArrayList ��� ���
//		ABCDEF�� �� ���ں��� ���
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase() ���
//		1~100���� �� ¦���� ArrayList�� ��� ���
//		Apple, banana, Melon �� ù ���� ���ڰ� �빮���� ���ڿ� ���
//		�ѱ��� ������ ����
//		������ �ѱ۷� ����
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		StreamTask streamTask = new StreamTask();
//		10~1���� ArrayList ��� ���
//		arrayList.stream().map(streamTask::num).forEach(System.out::println);
		
//		1~10���� ArrayList ��� ���
//		IntStream.rangeClosed(1, 10).forEach(arrayList::add);
//		System.out.println(arrayList);
		
//		ABCDEF�� �� ���ں��� ���
//		String data =  "ABCDEF";
//		data.chars().forEach(c -> System.out.println((char)c));
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
//		IntStream.rangeClosed(1, 100).filter(streamTask::Even).forEach(arrayList::add);
//		System.out.println(arrayList);
		
//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		ArrayList<Character> datas = new ArrayList<Character>();
//		IntStream.range(0, 5).map(i -> (i > 2 ? i+1 : i)).forEach(i -> datas.add((char)(i + 65)));
//		System.out.println(datas);
		
//		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase() ���
//		ArrayList<String> arrayListS = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		arrayListS.stream().map(String::toLowerCase).forEach(System.out::println);
		
//		1~100���� �� ¦���� ArrayList�� ��� ���
//		IntStream.rangeClosed(1, 100).filter(streamTask::odd).forEach(arrayList::add);
//		System.out.println(arrayList);
		
//		Apple, banana, Melon �� ù ���� ���ڰ� �빮���� ���ڿ� ���
//		65 = A ���� 90 = Z
//		ArrayList<String> arrayListS = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		System.out.println(arrayListS.stream().filter(c -> c.charAt(0) >= 65).filter(c -> c.charAt(0) <= 90).collect(Collectors.joining(", ")));
		
//		�ѱ��� ������ ����
//		String datas = "�����̻�����ĥ�ȱ���";
//		datas.chars().map(c -> datas.indexOf(c)).forEach(System.out::println);
		
//		������ �ѱ۷� ����("1024" -> '1' - 48 = 1)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�Է� ");
//		String d = "";
//		d = sc.next();
//		d.chars().map(c -> c - 48).forEach(c -> System.out.print(datas.charAt(c)));
	}
}
