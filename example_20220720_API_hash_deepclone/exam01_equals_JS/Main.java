package example_20220720_API_hash_deepclone.exam01_equals_JS;

public class Main {
    public static void main(String[] args) {

        Student studentA = new Student("이진실", 5);
        Student studentB = new Student("이진실", 3);
        Student studentC = new Student("이진실", 1);

        if (studentA.equals(studentB)) {
            System.out.println("같은 사람입니다");
        } else {
            System.out.println("같은 사람이 아닙니다.");
        }

        if (studentA.equals(studentC)) {
            System.out.println("같은 사람입니다");
        } else {
            System.out.println("같은 사람이 아닙니다");
        }
    };
}
