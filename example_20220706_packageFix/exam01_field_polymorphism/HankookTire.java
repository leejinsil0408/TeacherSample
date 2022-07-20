package example_20220706_packageFix.exam01_field_polymorphism;

public class HankookTire implements Tire {
	@Override
	public void roll() {
		System.out.println(" ");
	}

    public static interface Brake {
        public  void  stop();
    }

	public static class Car {
		public Tire frontLeftTire = new HankookTire();
		public Tire frontRightTire = new HankookTire();
		Tire backLeftTire = new HankookTire();  //접근제한자 public 쓰지않음
		Tire backRightTire = new HankookTire(); //접근제한자 public 쓰지않음

		Number01_brake num1  = new Number01_brake();

		Brake brake01 = new Number01_brake();

		Pedal pedal01 = new Number01_brake();

		public void run() {

			num1.push();
			num1.stop();

			System.out.println("---------------run01----------------");

			brake01.stop();

			System.out.println("---------------run02----------------");

			Number01_brake brake02 = (Number01_brake)brake01;
			brake02.push();

			//푸시라는 메소드 실행 안돼서 자식클래스 (브레이크넘버원)형변환으로 해줌으로써 푸시 메소드 실행
			//자식클래스 변수 = (자식클래스)부모타입클래스타입
			//부모클래스로 선언하면 자식클래스 메소드를 사용하지 못하지만
			//자식클래스로 선언하면 부모클래스와 자식클래스 메소드 모두 사용 가능합니다.

	//		frontLeftTire.roll();
	//		frontRightTire.roll();
	//		backLeftTire.roll();
	//		backRightTire.roll();
		}
	}
}
