package example_20220630.exam01_abstract_class;
					

//�߻� Ŭ���� phone�� ��� ���� SmartPhone �ڽ�Ŭ����
public class SmartPhone extends Phone {
	
	//������
	public SmartPhone(String owner) {
		super(owner);
		//�θ� Ŭ������ ������ ��� (super)
	}

	//�޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}
