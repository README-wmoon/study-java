package bank;

public class Kakao extends Bank{
	public Kakao() {
	}
	
//	잔액조회 재산 반토막
	@Override
	String checkBalance() {
		this.setMoney((int) (this.getMoney() * 0.5));
		return super.checkBalance();
	}
	
}
