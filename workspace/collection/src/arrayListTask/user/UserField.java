package arrayListTask.user;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import arrayListTask.DBConnector;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;



/*
 * /*
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

public class UserField {
	public ArrayList<User> users = new DBConnector().users;			// DBconnect Ŭ�����ȿ� User Ŭ������ ��ĳ���� ����
	public static String userId;
	private final int CERTIFICATED_NUMBER_LENGTH = 6;
	
//	�ߺ� �˻�	
	public User checkId(String id) {
		User user = null;
		for (int i = 0; i < users.size(); i++) {		//����� ȸ���� ��ŭ �ݺ�
			if(users.get(i).getId().equals(id)) {		//User Ŭ���� �ȿ� getId��� �����ڸ� ���� ���� id�� private����
				user = users.get(i);
				break;									// for���� �������� break�� ��ߵȴ�.
			}
		}
		
		return user;
	}
	
//	ȸ������
//	 �̸�, ���̵�, ��й�ȣ, �޴�����ȣ
	public void addUser(User user) {
		user.setPassword(encrypt(user.getPassword()));
		users.add(user);
	}
	
//	�α���
	public boolean login(String id, String password) {
		User user = checkId(id);
		
		if(user != null) {
			if(user.getPassword().equals(encrypt(password))) {
				return true;
			}
		}
		
		return false;
	}
	
//	�α׾ƿ�
	public void logout() {
		userId = null;
	}
	
	
//	��ȣȭ
	public String encrypt(String password) {
//		String pw = "";
//		for (int i = 0; i < pw.length(); i++) {
//			pw += (char)(password.charAt(i));
//		}
//		
//		return pw;
		
		return new String(Base64.getEncoder().encode(password.getBytes()));
		
	}
	
	public String decrypt(String encryptedPassword) {
		return new String(Base64.getDecoder().decode(encryptedPassword.getBytes()));
	}
	
//	��й�ȣ ����(���� ������)
	public void passwordUpdate(User user) {
//		System.out.print("��й�ȣ �Է�: ");
//		String pw = sc.next();
//		boolean login = false;
//		
//		for (int i = 0; i < users.size(); i++) {
//			if(user.getPassword().equals(pw)){
//				login = true;
//			}
//		}
//		
//		if(login) {
//			System.out.print("���� ��й�ȣ");
//			String pwNew = sc.next();
//			user.setPassword(pwNew);
//		} else {
//			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
//		}
//		
//		return user;
		User userInDB = checkId(userId);
		users.set(users.indexOf(userInDB), user);
	}
//	������ȣ ����(API)
	public String messgeSend(String phoneNumber) {
		Random random = new Random();
		String number = "";
		
		for (int i = 0; i < CERTIFICATED_NUMBER_LENGTH; i++) {
			number += random.nextInt(10);
		}
		
		String api_key = "NCSH1R1VGMOJGOIC";
		String api_secret = "T0ODXVFAFVQXOFP8SOQKHLYVE9GKVQVE";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", "01099926920");
		params.put("from", "01099926920");
		params.put("type", "SMS");
		params.put("text", "���� �߼� �׽�Ʈ");
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
       }
		
		return number;
	}
}
