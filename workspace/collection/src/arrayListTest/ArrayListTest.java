package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?>: 제네릭(이름이 없는)
//		만약 만들때 내가 타입을 몰르고 선언할떄 쓰인다 -> 객체화를 할때 바꾼다. -> 타입을 정해놓지 않는다.(문법상 써야되니깐)
//		객체화 시 타입을 지정하는 기법
//		설계할 떄에는 타입을 지정할 수 없기 떄문에 임시로 타입을 선언할 때 사용한다.
		
		
//		object 안쓰이는 이유 -> 제네릭을 쓰는 이유
//		따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 떄문에 object가 아닌 제네릭으로 선언된다. 
//		지정한 타입에 제한을 둘 수 있다. -> <T> extends Number 요렇게 쓰인다.
		
//		capacity(용량): 미리 확보해 놓을 공간, 나의 메모리의 한계를 확인할 수 있다.
//		용량에 제한을 주는 것이 아니다!
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
		
//		정렬
		Collections.sort(datas);
		System.out.println(datas);
		
//		비정렬
		Collections.reverse(datas);
		System.out.println(datas);
		
//		섞기
		Collections.shuffle(datas);
		System.out.println(datas);
		
//		추가(삽입) 60 항상 30뒤에 삽입된다.
		if(!datas.contains(30)) {
			System.out.println("30이 안나옵니다.");
		} else {
			datas.add(datas.indexOf(30) + 1, 60);
		}
		System.out.println(datas);
//		수정 10을 1로 수정
		if(!datas.contains(10)) {
			System.out.println("10이 수정 되지 않습니다.");			
		} else {
			System.out.println(datas.set(datas.indexOf(10), 1) + "가 1로 수정 되었습니다.");
		} 
		
		System.out.println(datas);
//		삭제(값으로 삭제) 20을 삭제
		if(!datas.contains(20)) {
			System.out.println("20이 삭제되지 않습니다.");
		} else {
			datas.remove(Integer.valueOf(20));
		}
		System.out.println(datas);
		
//		삭제(인덱스로 삭제) 50을 삭제
		if(!datas.contains(50)) {
			System.out.println("50이 삭제되지 않습니다.");
		} else {
			datas.remove(datas.indexOf(50));
		}
		System.out.println(datas);
		
	}
}
