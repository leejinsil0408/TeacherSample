package example_20220630.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		
		// smartphone �ν��Ͻ�ȭ
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		// �θ� �߻�Ŭ������ ��ӹ��� �ڽĸ޼ҵ�smartphone�� �̿��� �θ� �߻�Ŭ������ �޼ҵ� ��� 
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
