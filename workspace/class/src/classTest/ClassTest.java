package classTest;

class A {
	int data;				//���� ������ �ʱ�ȭ�� ���� �ʾƵ� �ȴ� -> �ڵ����� �ʱ�ȭ�� ��.
	
	A(String name) {		// �Ű�����
		System.out.println(name);
	}
	
	A(int data){
		System.out.println(this);
		this.data = data;		//�̸��� �Ȱ��� �ؾ� �򰥸��� �ʴ´�.
								// �������� �������� �Ǽ�, �����ϰ� ��ߵȴ�. -> ���������� ���� ���ν� �޸𸮸� ȿ�������� ��ߵȴ�.
	}
	
	void printData() {		// ���� ������ ������ �ʱ�ȭ�� �ؾߵǴµ�, ���������� �ʱ�ȭ�� ���� �ʾƵ� ��
		System.out.println(data);
	}
}


public class ClassTest {
	public static void main(String[] args) {
		A a = new A(10);
		A b = new A(20);
		System.out.println(a);
		System.out.println(b);
//		a.data = 10;
		a.printData();
		b.printData();
	}
}
