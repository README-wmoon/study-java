package classTest;

public class ClassTask4 {
	void getMaxAndMin(int[] arData, Store result) {	
		result.count = arData[0];
		
		for (int i = 0; i < arData.length; i++) {
			if(result.count < arData[i]) {result.count = arData[i];}
			if(result.count > arData[i]) {result.count = arData[i];}
		}
	}
	
	public static void main(String[] args) {
		int[] arData = {2, 5, 6, 1, 8};
		Store result = new Store(); 
		new ClassTask4().getMaxAndMin(arData, result);
	}
}
