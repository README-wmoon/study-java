package castingTest;

// ��������
// �ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
// ����ڰ� ������ ������
// �ִϸ��̼��̶�� "�ڸ� ����" ��� ���
// ��ȭ��� "4D" ��� ���
// ��󸶶�� "����" ��� ���



public class CastingTask {
	public void checkVideo(Netflex netflix) {
		if(netflix instanceof Animation) {
			System.out.println("�ڸ� ����");
		}
		
		else if(netflix instanceof Drama) {
			System.out.println("����");
		}
		
		else if(netflix instanceof Film) {
			 Film flim = (Film) netflix;
			 flim.checkFlim();
			  
		}
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
