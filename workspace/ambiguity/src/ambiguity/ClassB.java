package ambiguity;

public class ClassB extends ClassA implements InterA{
	@Override
	public void printName() {
		// TODO Auto-generated method stub
		InterA.super.printName();
	}
	public static void main(String[] args) {
		new ClassB().printName();
	}
}
