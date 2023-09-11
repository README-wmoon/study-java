package castingTest;

// 넷프릭스
// 애니메이션, 영화, 드라마 클래스 선언
// 사용자가 선택한 영상이
// 애니메이션이라면 "자막 지원" 기능 사용
// 영화라면 "4D" 기능 사용
// 드라마라면 "굿즈" 기능 사용



public class CastingTask {
	public void checkVideo(Netflex netflix) {
		if(netflix instanceof Animation) {
			System.out.println("자막 지원");
		}
		
		else if(netflix instanceof Drama) {
			System.out.println("굿즈");
		}
		
		else if(netflix instanceof Film) {
			 Film flim = (Film) netflix;
			 flim.checkFlim();
			  
		}
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
