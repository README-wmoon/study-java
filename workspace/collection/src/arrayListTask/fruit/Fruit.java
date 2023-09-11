package arrayListTask.fruit;


/*
 * [ArrayList 실습1]

과일 정보를 담을 클래스 선언(Fruit)
   - 과일 이름(중복 없음)
   - 과일 가격
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
