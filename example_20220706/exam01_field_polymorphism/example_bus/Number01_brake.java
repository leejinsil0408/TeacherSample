package example_20220706.exam01_field_polymorphism.example_bus;

import example_20220706.exam01_field_polymorphism.Brake;
import example_20220706.exam01_field_polymorphism.Pedal;

public class Number01_brake implements Brake, Pedal {
    public  void  stop() {
        System.out.println("Number01 브레이크 실행");
    }

    public  void push() {
        System.out.println("Number01 패달 실행");
    }
}
