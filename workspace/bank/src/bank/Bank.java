package bank;


public class Bank {
	public static Bank[][] arrBank = new Bank[3][100];
	public static int[] arCount = new int[3];
	public static int bankNum = -1;					// ���� 0 ���� 1 īī�� 2 �϶�.
	
	private String name;
	private String accountNum;
	private String phoneNum;
	private String password;
	protected int money;
	
	public Bank() {
	}
	

	public static Bank[][] getArrBank() {
		return arrBank;
	}




	public static void setArrBank(Bank[][] arrBank) {
		Bank.arrBank = arrBank;
	}




	public static int[] getArCount() {
		return arCount;
	}




	public static void setArCount(int[] arCount) {
		Bank.arCount = arCount;
	}




	public static int getBankNum() {
		return bankNum;
	}




	public static void setBankNum(int bankNum) {
		Bank.bankNum = bankNum;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAccountNum() {
		return accountNum;
	}




	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}




	public String getPhoneNum() {
		return phoneNum;
	}




	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public int getMoney() {
		return money;
	}




	public void setMoney(int money) {
		this.money = money;
	}




	// *static
	// ���¹�ȣ �ߺ��˻�
	// �ڵ�����ȣ �ߺ��˻�
	// �α���
	// final�� �����Ǹ� ���� ���ϰ� �Ѵ�.
	public final static Bank checkAccount(String accountNum) {
		Bank user = null;
		for (int i = 0; i < arrBank.length; i++) {
			for (int j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getAccountNum().equals(accountNum)) {				// ��ī��Ʈ ���¹�ȣ�� ��
					bankNum = i;												
					user = arrBank[i][j];
					break;
				}
				if(j != arCount[i]) {break;}
			}
		}
		return user;
	}
	
	public final static Bank checkPhone(String phoneNum) {		
		Bank user = null;
		for (int i = 0; i < arrBank.length; i++) {
			for (int j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].accountNum.equals(phoneNum)) {				// phoneNum�� ���� ���Ͱ� ������
					user = arrBank[i][j];									// �߰��ض�
					break;
				}
				if(j != arCount[i]) {
					break;
				}
			}
		}
		return user;
	}
	
	public final static Bank login(String accountNum, String password) {
		Bank user = checkAccount(accountNum);
		
		
//		���¹�ȣ�� ������
		if(user != null) {				
//			��й�ȣ ��
			if(user.password.equals(password)) {
				return user;
			}
		}
		
		return null;
	}

	
// *�Ϲ�
// �Ա�
// ���
// �ܾ���ȸ
	
	
	boolean withdraw(int money) {
		if(this.money - money < 0) {
			return false;
		} else {
			this.money -= money;
		}
		return true;
	}
	
	boolean deposit(int money) {
		if(money <=0) {
			return false;
		}
		else {
			this.money += money;
		}
		return true;
	}
	
	String checkBalance() {
		String num = null;
		String personInfo = "���¹�ȣ" + this.accountNum + "\n"
								+ "������ �̸�" + this.name + "\n"
								+ "�ܾ� �����ֱ�" + this.money + " �� �Դϴ�.";
		
//		���� ��Ÿ���� īī�� 0 ���� 1 ���� 2
		switch (bankNum) {
		case 0:
			num = "���� ����";
			break;
		case 1:
			num = "���� ����";
			break;
		case 2:
			num = "īī�� ��ũ";
			break;
		}
		
		personInfo = num + "����" + "\n" + personInfo;
		
		return personInfo;
	}
}
