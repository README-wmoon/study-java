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

@FunctionalInterface
public interface PrintName {
	void getFullName(String fName, String lName);
}
