//package example_20220630;
//
//import exam01_abstract_class.*;
//import exam02_abstract_method.*;

//public class main {
//
//    public static void main(String[] arg) {
//        abstract01();
//        abstract02();
//    }
//
//
//    private static void abstract01() {
//        SmartPhone smartPhone = new SmartPhone("홍길동");
//        //자식클래스 인스턴스화
//
//        //인스턴스화 해서 부모메소드(추상메소드) 사용
//        smartPhone.turnOn();
//        smartPhone.internetSearch();
//        smartPhone.turnOff();
//        System.out.println("------형변환전------");
//
//        Phone Not_SmartPhone = (Phone) smartPhone;
//        Not_SmartPhone.turnOn();
//        //Not_SmartPhone.internetSearch();
//        Not_SmartPhone.turnOff();
//        System.out.println("------형변환후------");
//    }
//
//
//    private static void abstract02() {
//
//
//        //클래스 변수명 =  인스턴스 할당
//        //선언한 곳으로 가서(stack) 타입을 찾는다. heap 메모리 영역에 가서 값을 불러온다
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//
//        dog.sound();
//        //추상 클래스(부모클래스)에게 상속 받은 Dog (자식클래스) 인스턴스의 사운드 출력
//        cat.sound();
//        //추상 클래스(부모클래스)에게 상속 받은 Cat (자식클래스) 인스턴스의 사운드 출력
//        System.out.println("-----");
//
//
//        //변수의 자동 타입 변환 (부모타입의 메소드를 갖다 쓰기 위해 형변환)
//        Animal animal = null;
//        //선언 후 할당, animal은 추상 클래스
//        animal = new Dog();
//        // Dog라는 클래스를 인스턴스화 시키고 animal에 대입
//        //주소값이 바뀌어서 animal을 호출 시 new dog를 불러온다
//        animal.sound();
//        // animal과 Dog는 서로 부모자식관계
//        animal = new Cat();
//        animal.sound();
//        System.out.println("-----");
//
//        //매개변수의 자동 타입 변환
//        animalSound(new Dog());
//        animalSound(new Cat());
//        // 인자값 = 인스턴스, 매개변수 타입 Animal
//        // Animal animal = new Dog();
//    }
//
//    public static void animalSound(Animal animal) {
//        animal.sound();
//    }
//
//}
//
