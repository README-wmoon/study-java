package arrayListTask;

import java.util.ArrayList;

import arrayListTask.fruit.Fruit;
import arrayListTask.user.User;

	/*
	 * [��ȭ �ǽ�]
		User Ŭ���� ����
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

	public class DBConnector {
	public static ArrayList<User> users = new ArrayList<User>();
	public static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	}

