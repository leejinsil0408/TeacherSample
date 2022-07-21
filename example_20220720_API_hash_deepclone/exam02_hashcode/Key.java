package example_20220720_API_hash_deepclone.exam02_hashcode;

//Key라는 Class : heap 메모리에 있는 것이 아닌 어디까지나 껍대기,설계도. 구현전까진 없음
public class Key {
	public int number;
	//필드 : number, enc
	public int enc;

	//생성자 (int number를 매개변수로 받음)
	public Key(int number) {

		//this(제일 가까운 객체인 Key라는 class를 가르킴)
		//this.number : Key라는 Class의 number라는 필드값을 가르킴
		// = number : 매개변수 number가 this.number에 할당됨
		this.number = number;
		this.enc = 2300;
	}
	//메서드 : 인스턴스가 갖고 있는 기능
	//메서드 equals는 Object에 있는 equals 메서드를 재정의해서 사용
	//모든 클래스는 Object라는 클래스에서 시작되며 상속
	//equals를 재정의해서ㅓ 새로운 비교구문 만들기
	//@ : 어노테이션은 아래 메서드의 성질을 JVM에게 선언해주는 구문
	//(JVM이 Key Class의 equals라는 메서드가 Object에서 상속받은 메서드가 아닌
	// 재정의된 메서드인 것으로 인식할 수 있도록 @어노테이션 Override 선언)
	//(Object obj) : 매개변수로써 어떤 인스턴스든 Object로 형변환
	//모든 객체(메서드)는 입구(통로)가 매개변수이기때문에 Objcet로 자동 형변환 (Object obj)
	// >> 모든 클래스의 부모는 Object이기 때문에 가능하다.
	//모든 클래스를 매개변수로 받을 수 있으므로 자바의 다형성 표현
	//어디까지나 타입의 형변환 (인스턴스의 타입이 바뀌는게 아님)
	// >> heap 메모리에 있는 인스턴스가 바뀌는 것은 아님.

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			//comparyKey는 obj의 Key타입 형변환 내용을 대입받는다.
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		} 
		return false;
	}

	//HashCode도 Override할 수 있다.
	//주소 + 31(홀수 > 특정연산작업속도를 간략히) + 기타등등(컴퓨터의 기초 메타데이터)
	//hashcode() 메서드는 equals() 메서드랑 동일하게 Object 클래스(최상위 부모클래스)의 메서드
	//어떤 클래스나 Object 클래스를 상속받기 때문에 hashcode()와 euqals() 메서드를 쓸 수 있다.
	@Override
	public int hashCode() {
		return number;
	}
}

