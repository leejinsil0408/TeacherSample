package example_20220706_packageFix.exam01_field_polymorphism.Question7Teacher;



public class People implements Eat {
    private String name;
    private String jellyName;

    //사람을 매개변수로 받기
    People() {
        this.name = "알 수 없는";
    }

    People(String input_name, String input_jelly) {
        this.name = input_name;
        this.name = input_jelly;
    }
    //매개변수를 받아 썼음
    public void eat(String action) {
        System.out.println(this.name + "이(가)" + jellyName + "을 " + action);
    }

}
