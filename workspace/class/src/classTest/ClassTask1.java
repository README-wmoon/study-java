package classTest;

class SuperCar {
	String brand;
	String color;
	int price;
	boolean engine;
	String password;
	
	{		// � �����ڸ� ȣ���ϵ� �����ִ� �ڵ尡 ����ȴ�. -> �ʱ�ȭ ���
		this.password ="abcd";
	}
	public SuperCar() {
	}
	
	public SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}


//	�õ� �ѱ�
//	���� ���¸� Ȯ���ϰ�
//	�õ��� �����ִٸ�, "�õ� ����" ���
//	�̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���
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
	
//	�õ� ����
//	���� ���¸� Ȯ���ϰ�
//	�õ��� �����ִٸ�, "�õ� ����" ���
//	�̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���
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
	
//	�õ��� �ѱ� ���ؼ� ��й�ȣ 4�ڸ��� �Է¹޾ƾ� �Ѵ�.
//	3�� ���� �߸� �Է����� �� "���� �⵿" ���
//	* ���ڿ� �񱳴� equals()�� ���Ѵ�.
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
	void enginePassword(String password) {
		String oriPassword = null;
		int count = 3;
//		if(this.password.equals(oriPassword)) {
//			System.out.println("�н����尡 �¾ҽ��ϴ�.");
//		}
//		
//		else {
//			System.out.println("�н����尡 Ʋ�Ƚ��ϴ�.");
//		}
		
		for (int i = 0; i < count; i++) {
			if(this.password.equals(password)) {
				System.out.println("�¾ҽ��ϴ�. ");
				break;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.�ٽ� �ѹ� ���ּ���");
			}
		}
		if(!this.password.equals(oriPassword)) {
			System.out.println("���� �⵿");
		}
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
		SuperCar mom = new SuperCar("���", "������", 68_000);
		mom.enginePassword("asfas");
	}
	
}
