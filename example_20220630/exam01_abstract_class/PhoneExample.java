package example_20220630.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		
		// smartphone 인스턴스화
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		// 부모 추상클래스를 상속받은 자식메소드smartphone을 이용해 부모 추상클래스의 메소드 사용 
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
