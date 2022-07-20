package example_20220706.exam01_field_polymorphism;

import example_20220706.exam01_field_polymorphism.example_bus.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new example_20220706.exam01_field_polymorphism.example_bus.KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();

		System.out.println("-------check001-------");
	}
}
