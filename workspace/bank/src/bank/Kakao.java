package bank;

public class Kakao extends Bank{
	public Kakao() {
	}
	
//	�ܾ���ȸ ��� ���丷
	@Override
	String checkBalance() {
		this.setMoney((int) (this.getMoney() * 0.5));
		return super.checkBalance();
	}
	
}
