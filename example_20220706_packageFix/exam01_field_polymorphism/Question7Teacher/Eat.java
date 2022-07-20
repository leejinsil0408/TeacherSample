package example_20220706_packageFix.exam01_field_polymorphism.Question7Teacher;

public  interface Eat {
    //추상메소드 사용
    public void eat(String action);

    default public void eatFix() {
        System.out.println("을 먹습니다");
}








    }
