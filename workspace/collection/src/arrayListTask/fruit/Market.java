package arrayListTask.fruit;

import java.util.ArrayList;
import java.util.Iterator;

import arrayListTask.DBConnector;

/*
 * CRUD���� ����� ��Ƴ��� Ŭ���� ����(Market)
   - ���� �߰�
   - ���� ����
   - ���� ������ ��� ���ݺ��� ���� �� �˻�
   - ���� ��ü ��ȸ
   - ���� �̸����� ���� ��ȸ
 */


public class Market {
	public ArrayList<Fruit> fruits = new DBConnector().fruits;
	
	
//	���� �߰�
	public void fruitInsert(String name) {
		fruits.contains(name);
	}
	
//	���� ����
	public void fruitRemove(String name) {
		fruits.remove(name);
	}
	
//	2.DB���� ��ü ��ȸ
//	public void findbyPriceLessThanAverage() {
//		for(Fruit fruit : fruits) {
//			if(fruit.getPrice())
//		}
//	}
	
//	���� ������ ��� ���ݺ��� ���� �� �˻�
	public void priceCheck(Fruit fruit) {
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getPrice() > fruit.getPrice()) {
				System.out.println("�� ������ ��� ���ݺ��� ��Դϴ�.");
				break;
			} else {
				System.out.println("�� ������ �����ϴ�.");
				break;
			}
		}
	}
	
//	���� ��ü ��ȸ
	public Fruit showFruits() {
		Fruit fruit = null;
		
		for (int i = 0; i < fruits.size(); i++) {
			fruit = fruits.get(i);
			
		}
		return fruit;
	}
	
	
//	 ���� �̸����� ���� ��ȸ
	public String foodName(String name) {
		Fruit fruit = null;
		for (int i = 0; i < fruits.size(); i++) {
			if(name.equals(fruits.contains(name))) {
				System.out.println(fruits.contains(fruit.getPrice()));
				
			} else {
				System.out.println("�� ������ ���ų� ������ȸ�� ���� �ʽ��ϴ�.");
			}
		}
		
		return name;
	}

}
