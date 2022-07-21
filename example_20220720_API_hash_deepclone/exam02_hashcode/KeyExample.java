package example_20220720_API_hash_deepclone.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		//HashMap이라는 타입으로 선언하되 안에 값은 key라는 객체와 String 문자열을 넣는다
		//= new HashMap<key, String> : heap 메모리에 인스턴스 만들기
		//HashMap<String,String> : key위치는 String, value는 String
		//ket(String)으로 검색해서 vaule(String)을 받는다 (HashMap의 구조)
		//HashMap 특징 : key값은 중복 안됨
		//key값 "김준석", Value "오전수업"
		//key값 "김준석", Value "오후수업"
		//"김준석"을 검색하면 "오후수업"이 뜬다. "김준석"이 중복되기에 뒤 오후수업이 덮어쓰기됨
		//해쉬맵<키값(class),벨류> 키값을 통해 vaule를 찾는다.
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//Key라는 객체타입으로 testKey라는 변수명으로 타입 선언
		// = new Key(23); = heap 메모리에서 Key라는 인스턴스를 생성 (단, 인자값 23 넣음)
		//생성자(매개변수 23) 실행
		Key testkey = new Key(23);
		Key testkey_1 = new Key(23);
		System.out.println(testkey.hashCode());
		System.out.println(testkey_1.hashCode());
		System.out.println("----------------------------");

		//json 포맷으로 인터넷 통신을 주로 한다. (json 방식 : key, value)
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		//hashMap의 put() : hashMap에 데이터 넣기
		//String[] a; a[0] = "김준석" 과 동일
		//a[0] = key, "김준석" = "홍길동" //Key값은 중복이 안된다.
		hashMap.put(new Key(1), "홍길동");
		hashMap.put(new Key(1),"김준석");
		hashMap.put(testkey,"오준석");
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽어옴
		//hashMap.get() : 인가잢(key)를 넣어서 key와 함께 넣은 value 반환(출력)
		//hashMap.get() 메서드의 비교방식
		//new kiy(1)이라고 get()에 매개변수를 넣으면 새로운 인스턴스가 만들어진다 !!
		//홍길동의 key값과 다르다고 인식 >> 인스턴스,주소가 달라서 hashcode()도 다르다.
		//그래서 홍길동의 Key와 다르다고 인식 (hashcode() 기반으로 구분 = HashMep의 자료저장 구조)
		// 그래서 오버라이딩한 홍길동 주석처리 후 실행하면 null이 뜬다.
		String value  = hashMap.get(new Key(1));
		System.out.println(value);
		//"오준석"이라는 문자열의 부모 해시코드 메서드
		System.out.println(hashMap.get(testkey).hashCode());

		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}
}


