package arrayListTask.fruit;

import java.util.ArrayList;
import java.util.Iterator;

import arrayListTask.DBConnector;

/*
 * CRUD관련 기능을 담아놓을 클래스 선언(Market)
   - 과일 추가
   - 과일 삭제
   - 과일 가격이 평균 가격보다 낮은 지 검사
   - 과일 전체 조회
   - 과일 이름으로 가격 조회
 */


public class Market {
	public ArrayList<Fruit> fruits = new DBConnector().fruits;
	
	
//	과일 추가
	public void fruitInsert(String name) {
		fruits.contains(name);
	}
	
//	과일 삭제
	public void fruitRemove(String name) {
		fruits.remove(name);
	}
	
//	2.DB에서 전체 조회
//	public void findbyPriceLessThanAverage() {
//		for(Fruit fruit : fruits) {
//			if(fruit.getPrice())
//		}
//	}
	
//	과일 가격이 평균 가격보다 낮은 지 검사
	public void priceCheck(Fruit fruit) {
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getPrice() > fruit.getPrice()) {
				System.out.println("이 가격은 평균 가격보다 비쌉니다.");
				break;
			} else {
				System.out.println("이 가격은 낮습니다.");
				break;
			}
		}
	}
	
//	과일 전체 조회
	public Fruit showFruits() {
		Fruit fruit = null;
		
		for (int i = 0; i < fruits.size(); i++) {
			fruit = fruits.get(i);
			
		}
		return fruit;
	}
	
	
//	 과일 이름으로 가격 조회
	public String foodName(String name) {
		Fruit fruit = null;
		for (int i = 0; i < fruits.size(); i++) {
			if(name.equals(fruits.contains(name))) {
				System.out.println(fruits.contains(fruit.getPrice()));
				
			} else {
				System.out.println("이 과일은 없거나 가격조회가 되지 않습니다.");
			}
		}
		
		return name;
	}

}
