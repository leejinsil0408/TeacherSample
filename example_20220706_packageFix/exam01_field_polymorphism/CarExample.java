package example_20220706_packageFix.exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		HankookTire.Car myCar = new HankookTire.Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();

		System.out.println("-------check001-------");
	}
}
