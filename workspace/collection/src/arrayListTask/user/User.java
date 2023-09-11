package arrayListTask.user;

/*
 * [��ȭ �ǽ�]
	User Ŭ���� ����
	- �̸�, ���̵�, ��й�ȣ, �޴�����ȣ				// array userŸ������ Ŭ���� ���� �ؾ� �ȴ�. (���̵�, �޴��� ��ȣ)
	- private ������ ���
	- �⺻ ������ ����
	- toString() ������
	
	DBConnecter Ŭ���� ����
	- ȸ�� ������ ���� DB�� ArrayList�� ����			

	UserField Ŭ���� ����
	- ���̵� �ߺ��˻�
	- ȸ������
	- �α���
	- ��ȣȭ
	- ��й�ȣ ����(���� ������)
	- ������ȣ ����(API)					// ������ȣ ����
 */


public class User {
	/*
	 * 	- �̸�, ���̵�, ��й�ȣ, �޴�����ȣ				// array userŸ������ Ŭ���� ���� �ؾ� �ȴ�. (���̵�, �޴��� ��ȣ)
		- private ������ ���
		- �⺻ ������ ����
		- toString() ������
	 */
	private String name;
	private String id;
	private String password;
	private String phoneNum;
	
	public User() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + ", phoneNum=" + phoneNum + "]";
	}
}
