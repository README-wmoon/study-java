package printTest;

public class print {

	public static void main(String[] args) {
		
		System.out.println(inputNum("%", 5));
	}
	
	static String inputNum(String input, int num) {
		String result = "";
		for(int i=0; i<num; i++) {
			result += input;
		}
		
		return result;
	}

}
