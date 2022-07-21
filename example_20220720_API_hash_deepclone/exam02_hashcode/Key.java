package example_20220720_API_hash_deepclone.exam02_hashcode;

//Key��� Class : heap �޸𸮿� �ִ� ���� �ƴ� �������� �����,���赵. ���������� ����
public class Key {
	public int number;
	//�ʵ� : number, enc
	public int enc;

	//������ (int number�� �Ű������� ����)
	public Key(int number) {

		//this(���� ����� ��ü�� Key��� class�� ����Ŵ)
		//this.number : Key��� Class�� number��� �ʵ尪�� ����Ŵ
		// = number : �Ű����� number�� this.number�� �Ҵ��
		this.number = number;
		this.enc = 2300;
	}
	//�޼��� : �ν��Ͻ��� ���� �ִ� ���
	//�޼��� equals�� Object�� �ִ� equals �޼��带 �������ؼ� ���
	//��� Ŭ������ Object��� Ŭ�������� ���۵Ǹ� ���
	//equals�� �������ؼ��� ���ο� �񱳱��� �����
	//@ : ������̼��� �Ʒ� �޼����� ������ JVM���� �������ִ� ����
	//(JVM�� Key Class�� equals��� �޼��尡 Object���� ��ӹ��� �޼��尡 �ƴ�
	// �����ǵ� �޼����� ������ �ν��� �� �ֵ��� @������̼� Override ����)
	//(Object obj) : �Ű������ν� � �ν��Ͻ��� Object�� ����ȯ
	//��� ��ü(�޼���)�� �Ա�(���)�� �Ű������̱⶧���� Objcet�� �ڵ� ����ȯ (Object obj)
	// >> ��� Ŭ������ �θ�� Object�̱� ������ �����ϴ�.
	//��� Ŭ������ �Ű������� ���� �� �����Ƿ� �ڹ��� ������ ǥ��
	//�������� Ÿ���� ����ȯ (�ν��Ͻ��� Ÿ���� �ٲ�°� �ƴ�)
	// >> heap �޸𸮿� �ִ� �ν��Ͻ��� �ٲ�� ���� �ƴ�.

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			//comparyKey�� obj�� KeyŸ�� ����ȯ ������ ���Թ޴´�.
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		} 
		return false;
	}

	//HashCode�� Override�� �� �ִ�.
	//�ּ� + 31(Ȧ�� > Ư�������۾��ӵ��� ������) + ��Ÿ���(��ǻ���� ���� ��Ÿ������)
	//hashcode() �޼���� equals() �޼���� �����ϰ� Object Ŭ����(�ֻ��� �θ�Ŭ����)�� �޼���
	//� Ŭ������ Object Ŭ������ ��ӹޱ� ������ hashcode()�� euqals() �޼��带 �� �� �ִ�.
	@Override
	public int hashCode() {
		return number;
	}
}

