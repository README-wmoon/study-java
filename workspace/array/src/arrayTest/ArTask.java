package arrayTest;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		브론즈
//		1~10까지 배열에 담고 출력
//		10~1까지 중 짝수만 배열에 담고 출력
//		1~100까지 배열에 담은 후 홀수만 출력
//		int[] arData = new int[10];							//배열 담기
//		int evenCnt = 0;
//		for(int i=0; i<arData.length; i++) {
//			arData[i] = i + 1;
//			System.out.println(arData[i]);					// 출력
//		}
		
//		for(int i=0; i<arData.length; i++) {
//			arData[i] = i + 1;								
//			if(arData[i] % 2 == 0) {
//				evenCnt = arData[i];
//				System.out.println(evenCnt);
//			}
//		}
		
//		int[] arData2 = new int[100];						// 배열 안에 100을 담기
//		for(int i=0; i<arData2.length; i++) {				
//			arData2[i] = i + 1;							
//			if(arData2[i] % 2 == 1) {						// %2 == 1 -> 홀수
//				System.out.println(arData2[i]);
//			}
//		}
		
//		for(int i=0; i< arData2.length; i++) {				// 강사가 하신것
//			if(i % 2 != 0) {
//				continue;
//			} 
//			System.out.println(arData2[i]);
//		}
		
//		
//		실버
//		1~100까지 배열에 담은 후 짝수의 합 출력
//		A~F까지 배열에 담고 출력
//		A~F까지 중 C제외하고 배열에 담은 후 출력
		
//		int[] arData = new int[100];						// 배열 안에 100을 담기
//		int total = 0;
//		for(int i=0; i<arData.length; i++) {
//			arData[i] = i + 1;							
//			if(arData[i] % 2 == 0) {						// 짝수로 나타내기
//				total = total + arData[i];
//			}
//		}
//		System.out.println(total);						    //total 출력

//		char[] arr = new char[6];							// 새로운 캐릭터 안에 6을 담기
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (char)(65+i);							// 알파벳 순서대로 나옴
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);						// 출력
//		}
		
//		char[] arr = new char[5];							// 배열 안에 캐릭터로 index 5개 담기
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (char)(i >1 && i < 6? i + 66 : i +65);
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);						// 출력
//		}
		
//		max = arData[0];
//		min = arData[0];
		
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		int num[] = new int[5];				
//		int max =-9999 ,min = 9999;			//입력받는 값보다 작거나 큰 수 초기값 설정
//		String ex = "5개의 정수를 입력하시오: ";
//		String maxNum ="최대값: ";
//		String minNum ="최소값: ";
//		Scanner sc = new Scanner(System.in);
//		System.out.println(ex);
//		for(int i=0; i<num.length; i++) {
//			num[i] = sc.nextInt();
//			if(max<num[i]) {
//				max=num[i];
//			}
//			if(min >= num[i]) {
//				min=num[i];
//			}
//		}
//		
//		System.out.println(maxNum + max);
//		System.out.println(minNum + min);
		
//		다이아
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
//		int input =0, avg = 0, sum = 0;
//		Scanner sc = new Scanner(System.in);
//		String count = "정수의 갯수입력: ";						// 정수의 갯수를 입력 만듬
//		System.out.print(count);
//		input = sc.nextInt();
//		int arrData[] = new int[input];						// arrData안에 input을 대입
//		for(int i=0; i<input; i++) {
//			System.out.print("숫자 입력: ");					
//			arrData[i] = sc.nextInt();						//arrData 안에 숫자를 입력
//			sum = sum + arrData[i];
//			avg = sum / input;
//		}
//		System.out.println("avg: " + avg);					//평균 출력
		
//		avg = Dobule.parseDouble(String.format("%.2f", (double)total /input));
//		System.out.printf(avg);
	}
}
