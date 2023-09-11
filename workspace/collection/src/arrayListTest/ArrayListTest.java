package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?>: ���׸�(�̸��� ����)
//		���� ���鶧 ���� Ÿ���� ������ �����ҋ� ���δ� -> ��üȭ�� �Ҷ� �ٲ۴�. -> Ÿ���� ���س��� �ʴ´�.(������ ��ߵǴϱ�)
//		��üȭ �� Ÿ���� �����ϴ� ���
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
		
		
//		object �Ⱦ��̴� ���� -> ���׸��� ���� ����
//		���� �ٿ� ĳ������ �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ֱ� ������ object�� �ƴ� ���׸����� ����ȴ�. 
//		������ Ÿ�Կ� ������ �� �� �ִ�. -> <T> extends Number �䷸�� ���δ�.
		
//		capacity(�뷮): �̸� Ȯ���� ���� ����, ���� �޸��� �Ѱ踦 Ȯ���� �� �ִ�.
//		�뷮�� ������ �ִ� ���� �ƴϴ�!
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		datas.add(40);
		datas.add(50);
		datas.add(90);
		datas.add(70);
		datas.add(10);
		datas.add(80);
		datas.add(20);
		datas.add(30);
		datas.add(100);
		
		System.out.println(datas.size());
		System.out.println(datas);
		
//		����
		Collections.sort(datas);
		System.out.println(datas);
		
//		������
		Collections.reverse(datas);
		System.out.println(datas);
		
//		����
		Collections.shuffle(datas);
		System.out.println(datas);
		
//		�߰�(����) 60 �׻� 30�ڿ� ���Եȴ�.
		if(!datas.contains(30)) {
			System.out.println("30�� �ȳ��ɴϴ�.");
		} else {
			datas.add(datas.indexOf(30) + 1, 60);
		}
		System.out.println(datas);
//		���� 10�� 1�� ����
		if(!datas.contains(10)) {
			System.out.println("10�� ���� ���� �ʽ��ϴ�.");			
		} else {
			System.out.println(datas.set(datas.indexOf(10), 1) + "�� 1�� ���� �Ǿ����ϴ�.");
		} 
		
		System.out.println(datas);
//		����(������ ����) 20�� ����
		if(!datas.contains(20)) {
			System.out.println("20�� �������� �ʽ��ϴ�.");
		} else {
			datas.remove(Integer.valueOf(20));
		}
		System.out.println(datas);
		
//		����(�ε����� ����) 50�� ����
		if(!datas.contains(50)) {
			System.out.println("50�� �������� �ʽ��ϴ�.");
		} else {
			datas.remove(datas.indexOf(50));
		}
		System.out.println(datas);
		
	}
}
