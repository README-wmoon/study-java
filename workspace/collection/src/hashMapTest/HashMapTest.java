package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTest {
	public static void main(String[] args) {
//		key = set����, value = collection ����
//		���̵�, ��й�ȣ, �̸�, ����
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		JSONObject userJSON = null;
		String json = null;
		
		
		userMap.put("id", "hds");
		userMap.put("password", "1234");
		userMap.put("name", "�ѵ���");
		userMap.put("age", 20);
		
//		System.out.println(userMap.get("id"));
//		json �������� ���� org.json�ʿ���
		
		userJSON = new JSONObject(userMap);
		System.out.println(userJSON);
		
		try {
			userJSON.put("gender", "none");
			System.out.println(userJSON);
			
			json = userJSON.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(userJSON.get("id"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			userJSON = new JSONObject(json);
			System.out.println(userJSON.get("id"));
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
