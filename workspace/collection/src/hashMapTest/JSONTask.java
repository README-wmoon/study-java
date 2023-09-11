package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONTask {
	public static void main(String[] args) {
//		��ǰ Ŭ���� ����(��ǰ ��ȣ, ��ǰ �̸�, ��ǰ ����, ��ǰ ���)
//		1. ��ǰ 1���� �����Ͽ� JSON�������� ����
//		2. JSON ������ ��ǰ ���� �� ��ǰ ��� ���
//		3. ���� ���� ��ǰ ���� ����
//		4. ���� ���� ��ǰ�� KEY���� discount�� ����
//		5. JSON �������� ����
//		6. JSON ������ �ʵ� �߰�
//		7. JSON ������ ��ǰ ���� �� ������ ���
		HashMap<String, Object> box = new HashMap<String, Object>();
		String disBox = null;
		box.put("��ǰ ��ȣ", 1);
		box.put("��ǰ�̸�", "���ϸ��� ��");
		box.put("��ǰ ����", 5000);
		box.put("��ǰ ���", 36);
		
		
//		1. ��ǰ 1���� �����Ͽ� JSON�������� ����
		JSONObject jsonObject = null;
		jsonObject = new JSONObject(box);
		
//		2. JSON ������ ��ǰ ���� �� ��ǰ ��� ���
		try {
			System.out.println(jsonObject.get("��ǰ ���"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		3. ���� ���� ��ǰ ���� ����
		try {
			System.out.println(jsonObject.put("������", 6));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		4. ���� ���� ��ǰ�� KEY���� discount�� ����
//		6. JSON ������ �ʵ� �߰�
		try {
			
			jsonObject.put("������", 0.05);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		5. JSON �������� ����
//		7. JSON ������ ��ǰ ���� �� ������ ���
		try {
			System.out.println(jsonObject.get("������"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		
	}
}
