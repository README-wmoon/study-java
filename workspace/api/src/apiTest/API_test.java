package apiTest;

public class API_test {
	public static void main(String[] args) {
		Calc cal = new Calc(); 
		try {
			System.out.println(cal.divide(10, 3));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
