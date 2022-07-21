package example_20220720_API_hash_deepclone.exam01_equals_JS;
import java.lang.reflect.Member;
import java.util.Objects;

public class Student {
    /* �ʵ�
     ����������
     private : ���� Ŭ���� �������� ���� ����
     Student.name = "���ؼ�"; �ȵ� :ĸ��ȭ�� ����
     public : ��� �� ���� ����
     default : ���� ��Ű�� ������ ���� ����
     protect : ���� ��Ű�� + ��� ������ ���� ���� */
    private String name;
    private int groupNum;

    /* ������ : Ŭ���� �̸��� ����
        �����ε�(Ŭ������ ��Ÿ��) : �������� �Ű������� ���� �پ��� Ÿ������ ����
        �⺻������(�Ű����� ����) �Ѱ��� �ִ�. public Student() <<�׷��� �Ⱦ��� �Ⱥ��� �� */
    public Student(String name, int groupNum) {

        /*  this : ���� ����� ��ü ��Ī > Student��� Ŭ����
            this.name = Student�� �ʵ� name
            this.groupNum = Student�� �ʵ� groupNum */
        this.name = name;
        this.groupNum = groupNum;
    }

    /* �޼���
        getter, setter ���� ���� : ��ü�� ĸ��ȭ(�ܺο��� �ʵ尪�� �ٷ� ��ȸ �Ǵ� ������ ���� ����)
        ������ ������̶�� ����� �޼��带 �� ���� ����
        ��ü�� ���м�,���ȼ��� ���� �������Ѵ�.
        public�� �ʵ带 ������ ��ȸ�ϰ�, �����ؾ� �� ��쿡 ����. */


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

    // Student �ν��Ͻ� Ÿ������ �Ʒ� equals��� �޼����� �Ű������� �� (��, Object�� "Ÿ��" ����ȯ)

    //
    @Override
    public boolean equals(Object obj) {
        /* instanceof : �޸� heap�� �ִ� �ν��Ͻ����� ���ϴ� ��
            ���� �����̸� true
            ��ӹ޾Ҵٸ� �θ�Ŭ������ �����ϴٰ� true�� ���´�. */

        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (groupNum == student.getGroupNum() && name.equals(student.getName()))

            return true;
            } else {

        }   return false;
    }
}
