package classTest;

class SuperCar {
	String brand;
	String color;
	int price;
	boolean engine;
	String password;
	
	{		// 어떤 생성자를 호출하든 여기있는 코드가 실행된다. -> 초기화 블록
		this.password ="abcd";
	}
	public SuperCar() {
	}
	
	public SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}


//	시동 켜기
//	엔진 상태를 확인하고
//	시동이 꺼져있다면, "시동 꺼짐" 출력
//	이미 시동이 켜져있다면, "시동이 이미 켜져있습니다." 출력
	boolean engineStart() {
		String password = null;
		this.password = password;
		if(!engine) {
			enginePassword(this.password);
			engine = true;
			return true;
		}
		return false;
	}
	
//	시동 끄기
//	엔진 상태를 확인하고
//	시동이 꺼져있다면, "시동 꺼짐" 출력
//	이미 시동이 켜져있다면, "시동이 이미 켜져있습니다." 출력
	boolean engineStop() {
		String password = null;
		this.password = password;
		if(engine) {
			enginePassword(this.password);
			engine = true;
			return true;
		}
		return false;
	}
	
//	시동을 켜기 위해서 비밀번호 4자리를 입력받아야 한다.
//	3번 연속 잘못 입력했을 시 "경찰 출동" 출력
//	* 문자열 비교는 equals()로 비교한다.
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
	void enginePassword(String password) {
		String oriPassword = null;
		int count = 3;
//		if(this.password.equals(oriPassword)) {
//			System.out.println("패스워드가 맞았습니다.");
//		}
//		
//		else {
//			System.out.println("패스워드가 틀렸습니다.");
//		}
		
		for (int i = 0; i < count; i++) {
			if(this.password.equals(password)) {
				System.out.println("맞았습니다. ");
				break;
			} else {
				System.out.println("틀렸습니다.다시 한번 해주세요");
			}
		}
		if(!this.password.equals(oriPassword)) {
			System.out.println("경찰 출동");
		}
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
		SuperCar mom = new SuperCar("페라리", "빨간색", 68_000);
		mom.enginePassword("asfas");
	}
	
}
