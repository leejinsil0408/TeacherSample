package example_20220630.exam01_abstract_class;

//phone �̶�� �߻�Ŭ���� ����. �߻�Ŭ������ �ν��Ͻ�ȭ(new)�� �� ���� (��üȭ�� �� �� ����) 
// �߻�Ŭ������ �޼ҵ�(�߻�޼ҵ�)�� ����Ϸ���
// �߻�Ŭ���� phone�� ��ӹ��� �ڽ�Ŭ������ �ν��Ͻ�ȭ���ش�. 
public abstract class Phone {
	
	//�ʵ�
	public String owner;
	
	//������        �����ε�
	public Phone(String owner) {
		this.owner = owner;
	}

	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
		// ���� ������ �߻�Ŭ����, ������ �������̽�.
	}	

	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
