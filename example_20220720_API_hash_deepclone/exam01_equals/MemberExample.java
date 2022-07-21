package example_20220720_API_hash_deepclone.exam01_equals;

public class MemberExample {

/*	main Ŭ������ ���α׷��� ������ �� ó�� �����ϴ� �޼ҵ�
	�׻� ��ü �ȿ� �޼��尡 �ְ� �����Ų��. (��ü����)
	String[] �迭�� OS(������)���� �ʱ⿡ �����͸� �޴� �Ա�
	public : ���������ڷν� ��� �� ���� ����
	static : ���α׷����� �� 1���� �ν��Ͻ� �� ����
	void : return���� ��� �޼��尡 ����ǰ� �ٷ� ��	*/

	public static void main(String[] args) {
/* 		�ν��Ͻ� ����
		���� �κ� : menber Ÿ������ obj1 ���������� ����
		���Կ����� (=) : ������ �ִ� �ν��Ͻ��� ������ �ִ� ����κп� �Ҵ�(����)
		new : �ν��Ͻ� �κ����� ������ �޸𸮿� �Ҵ�Ǵ� ��,
		(����) MemberŸ������ ������ ����(������:���ڰ� String �ֱ�)  	*/

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		//�޸𸮿� Obj ��ü�� 3�� �Ҵ�� ��Ȳ (�ּҰ�)

		//�����ǵ� equals ���
		if(obj1.equals(obj2)) {

		/* obj1�� obj2 ��ü�� �� (�� ����Ÿ���̾ equals�޼��带 �Ἥ ��)
			�⺻Ÿ�Գ��� ���� ������ == ��� */

			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}


/* obj3��� ������(����κ�)�� obj2�� ���� ���� ����(�ּ� ����)

���� obj3�� �Ҵ�� �ν��Ͻ� ��� obj2�� �ν��Ͻ��� ����Ǿ

���� �ִ� obj3�� �Ҵ�� �ν��Ͻ��� ���� ������. (������ �÷��Ͱ� ã�Ƽ� ȸ��)

*/

		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}

	}
}
