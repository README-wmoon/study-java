package arrayListTask.user;

/*
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


public class User {
	/*
	 * 	- 이름, 아이디, 비밀번호, 휴대폰번호				// array user타입으로 클래스 선언 해야 된다. (아이디, 휴대폰 번호)
		- private 접근자 사용
		- 기본 생성자 선언
		- toString() 재정의
	 */
	private String name;
	private String id;
	private String password;
	private String phoneNum;
	
	public User() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + ", phoneNum=" + phoneNum + "]";
	}
}
