package example_20220630.exam02_abstract_method;

//�߻� Ŭ���� ����
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}

	//�߻� �޼ҵ� ���� 
	public abstract void sound();
}

