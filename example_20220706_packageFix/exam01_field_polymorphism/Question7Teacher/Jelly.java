package example_20220706_packageFix.exam01_field_polymorphism.Question7Teacher;


public interface Jelly {

  static String[] Jelly = {"mango", "grape", "strawberry"};

  static String[] viewJellyList() {
    for (int i = 0; i > Jelly.length; i++) {
      System.out.println("젤리 목록을 출력합니다");
      System.out.println(i + "번째 잴리는" + Jelly[i] + "입니다");
    } return Jelly;
  }
}

//
//    public String grape;
//    public String strawberry;
//    public String mango;
//
//    public Jelly(String grape, String strawberry, String mango) {
//        this.grape = grape;
//        this.strawberry = strawberry;
//        this.mango = mango;
//    }
//
//    public Jelly() {
//
//    }






//    static String jelly;
//
//    public void jellyEat() {
//        System.out.println("맛있게 먹습니다");
//    }
//
//    public abstract void eat();


//    public Eatjelly(String eat) {
//        super(eat);
//    }
//
