package bank;

public class Kookmin extends Bank{
	public Kookmin() {
	}
	
	
//	��� �� ������ 50%
	@Override
	boolean withdraw(int money) {
		money *= 1.5;
		return super.deposit(money);
	}
	
}
