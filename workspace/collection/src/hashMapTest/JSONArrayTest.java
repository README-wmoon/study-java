package hashMapTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONArrayTest {
	public static void main(String[] args) {
//		Product_pf product1 = new Product_pf("Á·¹ß", 39000, 10);
//		Product_pf product2 = new Product_pf("º¸½Ó", 45000, 10);
//		
//		JSONObject productJSON1 = new JSONObject(product1);
//		JSONObject productJSON2 = new JSONObject(product2);
		
		ArrayList<Product_pf> productList = 
				new ArrayList<Product_pf>(Arrays.asList( new Product_pf("Á·¹ß", 39000, 10), new Product_pf("º¸½Ó", 45000, 10)));
		
		ArrayList<JSONObject> productJSONs = new ArrayList<JSONObject>();
		
		productList.stream().map(product -> new JSONObject(product)).forEach(productJSONs::add);
				
		JSONArray products = new JSONArray(productJSONs);
//		products.put(productJSON1);
//		products.put(productJSON2);
		
		System.out.println(products.toString());
		
		for (int i = 0; i < products.length(); i++) {
			try {
//				System.out.println(products.get(i));
//				System.out.println(((JSONObject)products.get(i)).get("productName"));
				System.out.println(products.getJSONObject(i).get("productName"));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		
	}
}
