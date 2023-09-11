package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONTask {
	public static void main(String[] args) {
//		상품 클래스 선언(상품 번호, 상품 이름, 상품 가격, 상품 재고)
//		1. 상품 1개를 제작하여 JSON형식으로 변경
//		2. JSON 형식의 상품 정보 중 상품 재고 출력
//		3. 할인 중인 상품 정보 제작
//		4. 할인 중인 상품의 KEY값은 discount로 설정
//		5. JSON 형식으로 변경
//		6. JSON 할인을 필드 추가
//		7. JSON 형식의 상품 정보 중 할인율 출력
		HashMap<String, Object> box = new HashMap<String, Object>();
		String disBox = null;
		box.put("상품 번호", 1);
		box.put("상품이름", "자일리톨 껌");
		box.put("상품 가격", 5000);
		box.put("상품 재고", 36);
		
		
//		1. 상품 1개를 제작하여 JSON형식으로 변경
		JSONObject jsonObject = null;
		jsonObject = new JSONObject(box);
		
//		2. JSON 형식의 상품 정보 중 상품 재고 출력
		try {
			System.out.println(jsonObject.get("상품 재고"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		3. 할인 중인 상품 정보 제작
		try {
			System.out.println(jsonObject.put("닥터쥐", 6));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		4. 할인 중인 상품의 KEY값은 discount로 설정
//		6. JSON 할인을 필드 추가
		try {
			
			jsonObject.put("닥터쥐", 0.05);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		5. JSON 형식으로 변경
//		7. JSON 형식의 상품 정보 중 할인율 출력
		try {
			System.out.println(jsonObject.get("닥터쥐"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		
	}
}
