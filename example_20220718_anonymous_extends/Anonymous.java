package example_20220718_anonymous_extends;

public class Anonymous extends Person {
	//�ʵ� �ʱⰪ���� ����
	Person field = new Person() {
		int fieldInt;
		void work() {
			System.out.println("����մϴ�?");
		}
		@Override
		void wake() {
			fieldInt = 40;
			System.out.println("_first_ 6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method1() {
		//���ú��������� ����
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		//���ú��� ���
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}











