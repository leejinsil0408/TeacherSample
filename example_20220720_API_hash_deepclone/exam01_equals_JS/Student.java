package example_20220720_API_hash_deepclone.exam01_equals_JS;
import java.lang.reflect.Member;
import java.util.Objects;

public class Student {
    /* 필드
     접근제한자
     private : 같은 클래스 내에서만 접근 가능
     Student.name = "이준석"; 안됨 :캡슐화를 위함
     public : 모두 다 접근 가능
     default : 같은 패키지 내에서 접근 가능
     protect : 같은 패키지 + 상속 내에서 접근 가능 */
    private String name;
    private int groupNum;

    /* 생성자 : 클래스 이름과 동일
        오버로딩(클래스의 스타일) : 생성자의 매개변수를 통해 다양한 타입으로 생성
        기본생성자(매개변수 없는) 한개는 있다. public Student() <<그러나 안쓰면 안보일 뿐 */
    public Student(String name, int groupNum) {

        /*  this : 제일 가까운 객체 지칭 > Student라는 클래스
            this.name = Student의 필드 name
            this.groupNum = Student의 필드 groupNum */
        this.name = name;
        this.groupNum = groupNum;
    }

    /* 메서드
        getter, setter 쓰는 이유 : 객체의 캡슐화(외부에서 필드값을 바로 조회 또는 수정을 막기 위함)
        데이터 입출력이라는 기능의 메서드를 잘 쓰기 위함
        객체는 은닉성,보안성을 위해 닫혀야한다.
        public은 필드를 빠르게 조회하고, 갱신해야 할 경우에 쓴다. */


    public int getGroupNum() {
        return groupNum;
    }

    public String getName() {
        return name;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Student 인스턴스 타입으로 아래 equals라는 메서드의 매개변수로 들어감 (단, Object로 "타입" 형변환)

    //
    @Override
    public boolean equals(Object obj) {
        /* instanceof : 메모리 heap에 있는 인스턴스끼리 비교하는 것
            같은 핏줄이면 true
            상속받았다면 부모클래스도 동일하다가 true가 나온다. */

        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (groupNum == student.getGroupNum() && name.equals(student.getName()))

            return true;
            } else {

        }   return false;
    }
}
