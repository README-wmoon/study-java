package bank;

public class Shinhan extends Bank{
	public Shinhan() {
	}
	
//	�Ա� �� ������ 50%
	@Override
	boolean deposit(int money) {
		money *= 0.5;
		return super.deposit(money);
	}
	
}
