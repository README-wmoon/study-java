//20230118
package operTest;

public class Oper6 {
	public static void main(String[] args) {
//		break 설명
//		1 ~ 10까지 중 8까지만 출력
//		for(int i=0; i<10; i++) {
//			System.out.println(i + 1);
//			if(i == 7) {
//				break;
//			}
//		}
		
//		continue 설명
//		1 ~ 10까지 중 4를 제외하고 출력
		for (int i = 0; i < 10; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i+1);
		}
	}
}
