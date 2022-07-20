package example_20220630.exam02_abstract_method;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//변수의 자동 타입 변환 (Animal과 dog는 상속관계. 인스턴스된 dog는 타입이 Animal이 돼 부모인 척함)
		//재정의된 메소드를 쓰기 위해 형변환 
		Animal animal = null;
//        스택  (메모리영역)  힙 animal은 변수, 주소가 있다.
		// animal의 주소를 부르러 heap에 들어간다. 그 주소값은 null;
		animal = new Dog();
		// dog클래스를 animal클래스로 타입을 변환(형변환)
		//animal의 주소는 null인데 새로운 도구(new) Dog 클래스를 만든다.
		// 이제 주소에 new dog가 생겨 연결이 된다. 
		//대입 연산자 기준 왼쪽 스택, 오른쪽 힙 
		animal.sound();
		//주소값 new dog를 찾아 거기서 sound(); 메소드 호출
		animal = new Cat(); // 캣 안에 있는 메소드
		animal.sound();
		// 추상클래스 안에 있는 추상메소드를 부르기 위해 형변환을 해 캣에 있는 사운드 호출 
		System.out.println("-----");
		
		//매개변수의 자동 타입 변환
		animalSound(new Dog());
		animalSound(new Cat());
		//animalsound(매개변수 Animal A ) new cat 인자값을 넣음
		// Animal A 라는 타입 = new cat; 인스턴스 
		//변수명 A는 스택에 있다. 메모리에서 주소를 찾아보니 new cat과 Animal A가 같은 주소. 
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
