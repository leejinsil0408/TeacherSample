package example_20220630.exam01_abstract_class;

//phone 이라는 추상클래스 선언. 추상클래스는 인스턴스화(new)할 수 없다 (실체화를 할 수 없음) 
// 추상클래스의 메소드(추상메소드)를 사용하려면
// 추상클래스 phone을 상속받은 자식클래스를 인스턴스화해준다. 
public abstract class Phone {
	
	//필드
	public String owner;
	
	//생성자        오버로딩
	public Phone(String owner) {
		this.owner = owner;
	}

	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
		// 값이 있으면 추상클래스, 없으면 인터페이스.
	}	

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
