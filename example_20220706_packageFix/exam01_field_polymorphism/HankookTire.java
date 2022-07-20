package example_20220706_packageFix.exam01_field_polymorphism;

public class HankookTire implements Tire {
	@Override
	public void roll() {
		System.out.println(" ");
	}

    public static interface Brake {
        public  void  stop();
    }

	public static class Car {
		public Tire frontLeftTire = new HankookTire();
		public Tire frontRightTire = new HankookTire();
		Tire backLeftTire = new HankookTire();  //���������� public ��������
		Tire backRightTire = new HankookTire(); //���������� public ��������

		Number01_brake num1  = new Number01_brake();

		Brake brake01 = new Number01_brake();

		Pedal pedal01 = new Number01_brake();

		public void run() {

			num1.push();
			num1.stop();

			System.out.println("---------------run01----------------");

			brake01.stop();

			System.out.println("---------------run02----------------");

			Number01_brake brake02 = (Number01_brake)brake01;
			brake02.push();

			//Ǫ�ö�� �޼ҵ� ���� �ȵż� �ڽ�Ŭ���� (�극��ũ�ѹ���)����ȯ���� �������ν� Ǫ�� �޼ҵ� ����
			//�ڽ�Ŭ���� ���� = (�ڽ�Ŭ����)�θ�Ÿ��Ŭ����Ÿ��
			//�θ�Ŭ������ �����ϸ� �ڽ�Ŭ���� �޼ҵ带 ������� ��������
			//�ڽ�Ŭ������ �����ϸ� �θ�Ŭ������ �ڽ�Ŭ���� �޼ҵ� ��� ��� �����մϴ�.

	//		frontLeftTire.roll();
	//		frontRightTire.roll();
	//		backLeftTire.roll();
	//		backRightTire.roll();
		}
	}
}
