package example_20220706_packageFix.exam01_field_polymorphism;

public class Number02_brake implements HankookTire.Brake, Pedal {

    public  void push() {
        System.out.println("Number02 패달 실행");
    }
    public  void stop() {
        System.out.println("Number02 브레이크 실행");
    }
}
