package hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 30, 30, 30 ,20, 10, 90));
//		HashSet<Integer> dataSet = new HashSet<Integer>(datas);
//		datas = new ArrayList<Integer>(dataSet);
//		System.out.println(datas);
		
		
		HashSet<String> bloodTypeSet = new HashSet<String>();
		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("O");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		
		
		if(bloodTypeSet.contains("A")) {
			System.out.println("있음");
		}
		
//		System.out.println(bloodTypeSet);
//		//iterator는 순서에 상관없이 iterator 안에 있는 것을 순서를 바꿔주어야 된다.
//		Iterator<String> iter = bloodTypeSet.iterator();
//		
//		//중복 없앨때 알고리즘 필요함
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
