package bank;


public class Bank {
	public static Bank[][] arrBank = new Bank[3][100];
	public static int[] arCount = new int[3];
	public static int bankNum = -1;					// 신한 0 국민 1 카카오 2 일때.
	
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
	// 계좌번호 중복검사
	// 핸드폰번호 중복검사
	// 로그인
	// final은 재정의를 하지 못하게 한다.
	public final static Bank checkAccount(String accountNum) {
		Bank user = null;
		for (int i = 0; i < arrBank.length; i++) {
			for (int j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getAccountNum().equals(accountNum)) {				// 어카운트 계좌번호와 비교
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
				if(arrBank[i][j].accountNum.equals(phoneNum)) {				// phoneNum이 내가 쓴것과 같으면
					user = arrBank[i][j];									// 추가해라
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
		
		
//		계좌번호가 있을시
		if(user != null) {				
//			비밀번호 비교
			if(user.password.equals(password)) {
				return user;
			}
		}
		
		return null;
	}

	
// *일반
// 입금
// 출금
// 잔액조회
	
	
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
		String personInfo = "계좌번호" + this.accountNum + "\n"
								+ "예금주 이름" + this.name + "\n"
								+ "잔액 보여주기" + this.money + " 원 입니다.";
		
//		은행 나타내기 카카오 0 국민 1 신한 2
		switch (bankNum) {
		case 0:
			num = "신한 은행";
			break;
		case 1:
			num = "국민 은행";
			break;
		case 2:
			num = "카카오 뱅크";
			break;
		}
		
		personInfo = num + "은행" + "\n" + personInfo;
		
		return personInfo;
	}
}
