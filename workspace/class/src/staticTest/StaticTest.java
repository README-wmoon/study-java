package staticTest;

class Data {
	int data =10;				// �ν��Ͻ� ����
	
//	��� ��ü�� �����ؾ� �� �� static �ʵ带 �����Ѵ�.
	static int data_s = 10;		//Ŭ���� ����
	
	
	void increase() {
		System.out.println(++data);
	}
	
	void increase_s() {
		System.out.println(++data_s);
	}
}



public class StaticTest {
	public static void main(String[] args) {
		Data data = new Data();				// �̰� ���������� ��� �Ҵ��
											// ������ static�� �����Ϸ��� �Ҵ� �ȴ� new �����ڷ� �Ҵ���� �ʴ´�. -> static�� �Ѱ��� ���������. -> �־�? 
											//	-> ��� ��ü�� �����ؾߵɶ� ����
		
		Data data1 = new Data();
		Data data2 = new Data();
		
		Data.data_s = 20;
		
		data1.data = 30;
		System.out.println(data.data);
		System.out.println(data.data_s);	// static���� �� ���� ���� -> ��� ������� �������� �Ἥ ��ü�� �����ϸ� �ȵȴ�.
		System.out.println(Data.data_s);    // ��ɷ� ��ߵ� static�� -> �ϳ��� ��ߵǱ� ������ Ŭ������ ȣ���Ѵ�.
		
		
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		
//		data = new Data();
//		
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
		
		
		
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
//		
//		data = new Data();
//		
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
	}
}
