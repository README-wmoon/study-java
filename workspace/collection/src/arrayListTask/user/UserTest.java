package arrayListTask.user;

import java.util.Scanner;

/*
 * User Ŭ���� ����
	- �̸�, ���̵�, ��й�ȣ, �޴�����ȣ				// array userŸ������ Ŭ���� ���� �ؾ� �ȴ�. (���̵�, �޴��� ��ȣ)
	- private ������ ���
	- �⺻ ������ ����
	- toString() ������
	
	DBConnecter Ŭ���� ����
	- ȸ�� ������ ���� DB�� ArrayList�� ����			

	UserField Ŭ���� ����
	- ���̵� �ߺ��˻�
	- ȸ������
	- �α���
	- ��ȣȭ
	- ��й�ȣ ����(���� ������)
	- ������ȣ ����(API)					// ������ȣ ����
 */

public class UserTest {
	public static void main(String[] args) {
		UserField userField = new UserField();
		User user = new User();
		user.setId("hds123");
		user.setName("�ѵ���");
		user.setPassword("1234");
		user.setPhoneNum("0102004102");
		
		if(userField.checkId(user.getId()) == null) {
			
		}
		
		
		String menu = "1.ȸ������\n2.�α���\n3.��й�ȣ����\n4.����";
		int choiceMenu = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(menu);
			System.out.print("�Է�: ");
			choiceMenu = sc.nextInt();
			
			switch (choiceMenu) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
	
				break;
			case 4:
	
				break;

			}
		}
	}
}
