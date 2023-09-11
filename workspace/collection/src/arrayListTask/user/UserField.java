package arrayListTask.user;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import arrayListTask.DBConnector;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;



/*
 * /*
 * [심화 실습]
	User 클래스 선언
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

public class UserField {
	public ArrayList<User> users = new DBConnector().users;			// DBconnect 클래스안에 User 클래스를 업캐스팅 했음
	public static String userId;
	private final int CERTIFICATED_NUMBER_LENGTH = 6;
	
//	중복 검사	
	public User checkId(String id) {
		User user = null;
		for (int i = 0; i < users.size(); i++) {		//등록한 회원수 만큼 반복
			if(users.get(i).getId().equals(id)) {		//User 클래스 안에 getId라는 생성자를 통해 접근 id가 private여서
				user = users.get(i);
				break;									// for문을 끝내려면 break를 써야된다.
			}
		}
		
		return user;
	}
	
//	회원가입
//	 이름, 아이디, 비밀번호, 휴대폰번호
	public void addUser(User user) {
		user.setPassword(encrypt(user.getPassword()));
		users.add(user);
	}
	
//	로그인
	public boolean login(String id, String password) {
		User user = checkId(id);
		
		if(user != null) {
			if(user.getPassword().equals(encrypt(password))) {
				return true;
			}
		}
		
		return false;
	}
	
//	로그아웃
	public void logout() {
		userId = null;
	}
	
	
//	암호화
	public String encrypt(String password) {
//		String pw = "";
//		for (int i = 0; i < pw.length(); i++) {
//			pw += (char)(password.charAt(i));
//		}
//		
//		return pw;
		
		return new String(Base64.getEncoder().encode(password.getBytes()));
		
	}
	
	public String decrypt(String encryptedPassword) {
		return new String(Base64.getDecoder().decode(encryptedPassword.getBytes()));
	}
	
//	비밀번호 변경(마이 페이지)
	public void passwordUpdate(User user) {
//		System.out.print("비밀번호 입력: ");
//		String pw = sc.next();
//		boolean login = false;
//		
//		for (int i = 0; i < users.size(); i++) {
//			if(user.getPassword().equals(pw)){
//				login = true;
//			}
//		}
//		
//		if(login) {
//			System.out.print("변경 비밀번호");
//			String pwNew = sc.next();
//			user.setPassword(pwNew);
//		} else {
//			System.out.println("비밀번호가 틀렸습니다.");
//		}
//		
//		return user;
		User userInDB = checkId(userId);
		users.set(users.indexOf(userInDB), user);
	}
//	인증번호 전송(API)
	public String messgeSend(String phoneNumber) {
		Random random = new Random();
		String number = "";
		
		for (int i = 0; i < CERTIFICATED_NUMBER_LENGTH; i++) {
			number += random.nextInt(10);
		}
		
		String api_key = "NCSH1R1VGMOJGOIC";
		String api_secret = "T0ODXVFAFVQXOFP8SOQKHLYVE9GKVQVE";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", "01099926920");
		params.put("from", "01099926920");
		params.put("type", "SMS");
		params.put("text", "문자 발송 테스트");
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
       }
		
		return number;
	}
}
