/*
 * package lambdaTask1�� �����Ѵ�.

	PrintName �������̽� ����
	getFullName() �߻� �޼ҵ� ����
	- ���� �̸��� ���޹޴���.

	PrintNameTest Ŭ���� ����
	printFullName() �޼ҵ� ����
	- �ܺο��� ������ PrintName�� ���޹��� �� ��ü �̸��� ���
 */


package lambdaTask1;

public class PrintNameTest {
	public static void main(String[] args) {
		PrintName printFullName = (f, l) -> System.out.println("��: " + f + "\n" + "�̸� " + l);
		printFullName.getFullName("��", "���");
	}
	
}
