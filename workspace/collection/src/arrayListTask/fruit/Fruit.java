package arrayListTask.fruit;


/*
 * [ArrayList �ǽ�1]

���� ������ ���� Ŭ���� ����(Fruit)
   - ���� �̸�(�ߺ� ����)
   - ���� ����
 */

public class Fruit {
	private String foodName;
	private int price;
	
	public Fruit() {;}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [foodName=" + foodName + ", price=" + price + "]";
	}
	
	
}
