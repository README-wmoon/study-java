package bank;

import java.util.Random;
import java.util.Scanner;

//������ 3���� �����Ѵ�.
//��� ���� ���� �����ϴ� DB�� 2���� �迭�� �����Ѵ�.
//��� ������ ���, �Ա�, �ܾ���ȸ, ���°���, ���¹�ȣ �ߺ��˻�, �α���(���¹�ȣ, ��й�ȣ), �ڵ��� ��ȣ �ߺ��˻� ���񽺰� �ִ�.
//ȭ���� �޴��� "���°���, �Ա��ϱ�, ����ϱ�, �ܾ���ȸ, ���¹�ȣ ã��(���ο� ���¹߱�, �ڵ��� ��ȣ�� ���� �̿밡��), ������"�� �����Ǿ� �ִ�.
//���¹�ȣ�� RandomŬ������ ����Ͽ� 6�ڸ��� �����Ѵ�.
//���¸� ������ ���࿡���� �Ա� ���񽺸� �̿��� �� �ִ�(instanceof)
//�������� �������� īī����ũ



public class ATM {
	public static void main(String[] args) {
		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[3];
		final int ACCOUNT_LENGTH = 6;
		
		String msg = "1.��������\n2.��������\n3.īī�� ��ũ\n4.Exit";
		String menu = "1.���°���\n2.�Ա��ϱ�\n3.����ϱ�\n4.�ܾ���ȸ\n5.���¹�ȣ ã��\n6.Exit";
		String name = null;
		String accountNum = null;
		String phoneNum = null;
		String password = null;
		int money = 0;
		Bank user =null;
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int bankChoice = 0;
		int choice = 0;
		
		
		while(true) {
			System.out.println(msg);
			bankChoice = sc.nextInt();
			
			if(bankChoice == 4) {
				break;
			}
			
			bankChoice--;
			
			while(true) {
				System.out.println(menu);
				choice = sc.nextInt();
				
				if(choice == 6) {
					break;
				}
				
				switch (choice) {
//				���� ����, �������� ��ȣ
//				�ߺ��� ���� ��ȣ�� �Է��ؾ� ��
				case 1:
					accountNum = "";
					Bank[] arBank = {				// ���� �輳
							new Shinhan(),
							new Kookmin(),
							new Kakao()
					};
					
					user = arBank[bankChoice];
//					��ī��Ʈ�� ���� �ѹ� �����
//					���¹�ȣ�� 1���� ���� ����
					accountNum += r.nextInt(900000) + 100000; 				
					for (int i = 0; i <ACCOUNT_LENGTH - accountNum.length(); i++) {				// ��ī��Ʈ ���̸�ŭ
						accountNum += accountNum;												
					}
					
					if(Bank.checkAccount(accountNum) == null) {
						break;
					}
					
					user.setAccountNum(accountNum);
				case 2:
					

				default:
					break;
				}
			}
		}
	}
}
