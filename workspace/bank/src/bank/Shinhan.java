package bank;

public class Shinhan extends Bank{
	public Shinhan() {
	}
	
//	입금 시 수수료 50%
	@Override
	boolean deposit(int money) {
		money *= 0.5;
		return super.deposit(money);
	}
	
}
