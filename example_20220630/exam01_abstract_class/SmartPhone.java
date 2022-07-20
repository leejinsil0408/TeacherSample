package example_20220630.exam01_abstract_class;
					

//추상 클래스 phone을 상속 받은 SmartPhone 자식클래스
public class SmartPhone extends Phone {
	
	//생성자
	public SmartPhone(String owner) {
		super(owner);
		//부모 클래스의 생성자 사용 (super)
	}

	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
