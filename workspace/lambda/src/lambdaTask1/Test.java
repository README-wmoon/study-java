package lambdaTask1;

public class Test {
	public static void main(String[] args) {
		System.out.println("A+B+C".split("\\+")[0]);
		System.out.println("A+B-C".split("\\+|\\-")[1]);
	}
}
