package example_20220706.exam01_field_polymorphism.example_bus;

import example_20220706.exam01_field_polymorphism.Brake;
import example_20220706.exam01_field_polymorphism.Pedal;

public class Number02_brake implements Brake, Pedal {

    public  void push() {
        System.out.println("Number02 패달 실행");
    }
    public  void stop() {
        System.out.println("Number02 브레이크 실행");
    }
}
