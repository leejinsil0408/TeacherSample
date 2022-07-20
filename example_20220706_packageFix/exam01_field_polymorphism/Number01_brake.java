package example_20220706_packageFix.exam01_field_polymorphism;

public class Number01_brake implements HankookTire.Brake, Pedal {
    public  void  stop() {
        System.out.println("Number01 브레이크 실행");
    }

    public  void push() {
        System.out.println("Number01 패달 실행");
    }
}

