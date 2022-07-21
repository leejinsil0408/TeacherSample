package example_20220720_API_hash_deepclone.exam01_equals;
//필드:데이터 저장
public class Member {
	//생성자:클래스를 토대로 인스턴스를 만들 때 세팅
	public String id;
	//String 매개변수 id를 받아서 필드값 id에 할당(전달,대입)
	public Member(String id) {
		this.id = id;
	}
	//메서드: 인스턴스가 갖고있는 기능

	/*오버라이딩은 상속을 받아서 재정의를 하는 건데,
		member는 상속은 어디서 받았을까?
		모든 클래스는 object라는 클래스에서 시작되며 상속받는다.
		equls를 재정의해서 새로운 비교구문을 만들기
		@: 어노테이션은 아래 메서드의 성질을 JVM에게 선언해주는 구문
		boolean : 이 메서드가 실행되고 최종적으로 반환(리턴)되는
		"타입"이 boolean(true/false 둘 중 하나 반환 )
		(Object obj) : 매개변수로써 어떤 인스턴스든 Object로 "형변환"된다.
		어떤 클래스든 Object 객체를 모두 상속받기 때문에 최고 부모 클래스인 Object로
		"자동 형변환"이 가능하다 (타입의 형변환)
		member obj4 = new member("blue"); -> Object obj4 = new member("blue");*/
	@Override
	public boolean equals(Object obj) {
		//equals 기본 내장 메소드를 재정의 하려고 한다. boolean은 매개값이 필요하다.
		// 그래서 최상위 클래스인 Object를 매개타입 obj 변수명으로 지정한다.
		// Object obj와 형성할 자식 객체를 비교


	// 실제로 구현된 인스턴스의 타입은 Member이기 때문에 if문에 true가 뜬다
		if(obj instanceof Member) {
	// Member 타입으로 obj 매개변수를 형변환 (좌측obj 타입으로 변환된 객체가 Member인지 확인)
	//member라는 변수명으로 obj(주소)가 연결

			Member member = (Member) obj;
			//강제타입변환 : 자식타입 타입명 = (자식타입) 부모타입명
			// 하는 이유 : 부모타입의 메소드를 자식타입 객체의 메소드 재정의 하기 위함
			if(id.equals(member.id)) {
			/*	id = member의 필드값
				id = String이기 때문에 참조타입으로 equals를 통해 비교
				인스턴스의 id라는 필드값과 매개변수 obj(member)의 id를 비교 */
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		//String 문자열은 상수풀이기 때문에 같은 주소를 가르칠 것이고
		//같은 주소이면 hashcode가 통일하게 return 받습니다.
		return id.hashCode();
	}
}
