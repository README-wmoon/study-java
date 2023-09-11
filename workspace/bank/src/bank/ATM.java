package bank;

import java.util.Random;
import java.util.Scanner;

//은행은 3개를 선언한다.
//모든 은행 고객을 관리하는 DB를 2차원 배열로 선언한다.
//모든 은행은 출금, 입금, 잔액조회, 계좌개설, 계좌번호 중복검사, 로그인(계좌번호, 비밀번호), 핸드폰 번호 중복검사 서비스가 있다.
//화면쪽 메뉴는 "계좌개설, 입금하기, 출금하기, 잔액조회, 계좌번호 찾기(새로운 계좌발급, 핸드폰 번호로 서비스 이용가능), 나가기"로 구성되어 있다.
//계좌번호는 Random클래스를 사용하여 6자리로 설정한다.
//계좌를 개설한 은행에서만 입금 서비스를 이용할 수 있다(instanceof)
//신한은행 국민은행 카카오뱅크



public class ATM {
	public static void main(String[] args) {
		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[3];
		final int ACCOUNT_LENGTH = 6;
		
		String msg = "1.신한은행\n2.국민은행\n3.카카오 뱅크\n4.Exit";
		String menu = "1.계좌개설\n2.입금하기\n3.출금하기\n4.잔액조회\n5.계좌번호 찾기\n6.Exit";
		String name = null;
		String accountNum = null;
		String phoneNum = null;
		String password = null;
		int money = 0;
		Bank user =null;
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int bankChoice = 0;
		int choice = 0;
		
		
		while(true) {
			System.out.println(msg);
			bankChoice = sc.nextInt();
			
			if(bankChoice == 4) {
				break;
			}
			
			bankChoice--;
			
			while(true) {
				System.out.println(menu);
				choice = sc.nextInt();
				
				if(choice == 6) {
					break;
				}
				
				switch (choice) {
//				계좌 개설, 랜덤계좌 번호
//				중복이 없는 번호로 입력해야 됨
				case 1:
					accountNum = "";
					Bank[] arBank = {				// 은행 계설
							new Shinhan(),
							new Kookmin(),
							new Kakao()
					};
					
					user = arBank[bankChoice];
//					어카운트에 랜덤 넘버 만들기
//					계좌번호가 1부터 시작 가능
					accountNum += r.nextInt(900000) + 100000; 				
					for (int i = 0; i <ACCOUNT_LENGTH - accountNum.length(); i++) {				// 어카운트 길이만큼
						accountNum += accountNum;												
					}
					
					if(Bank.checkAccount(accountNum) == null) {
						break;
					}
					
					user.setAccountNum(accountNum);
				case 2:
					

				default:
					break;
				}
			}
		}
	}
}
