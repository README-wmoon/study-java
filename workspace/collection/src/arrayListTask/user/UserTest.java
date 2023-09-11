package arrayListTask.user;

import java.util.Scanner;

/*
 * User 클래스 선언
	- 이름, 아이디, 비밀번호, 휴대폰번호				// array user타입으로 클래스 선언 해야 된다. (아이디, 휴대폰 번호)
	- private 접근자 사용
	- 기본 생성자 선언
	- toString() 재정의
	
	DBConnecter 클래스 선언
	- 회원 정보를 담을 DB를 ArrayList로 선언			

	UserField 클래스 선언
	- 아이디 중복검사
	- 회원가입
	- 로그인
	- 암호화
	- 비밀번호 변경(마이 페이지)
	- 인증번호 전송(API)					// 인증번호 전송
 */

public class UserTest {
	public static void main(String[] args) {
		UserField userField = new UserField();
		User user = new User();
		user.setId("hds123");
		user.setName("한동석");
		user.setPassword("1234");
		user.setPhoneNum("0102004102");
		
		if(userField.checkId(user.getId()) == null) {
			
		}
		
		
		String menu = "1.회원가입\n2.로그인\n3.비밀번호변경\n4.종료";
		int choiceMenu = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(menu);
			System.out.print("입력: ");
			choiceMenu = sc.nextInt();
			
			switch (choiceMenu) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
	
				break;
			case 4:
	
				break;

			}
		}
	}
}
