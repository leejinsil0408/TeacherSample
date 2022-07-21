package example_20220720_API_hash_deepclone.exam01_equals;
//�ʵ�:������ ����
public class Member {
	//������:Ŭ������ ���� �ν��Ͻ��� ���� �� ����
	public String id;
	//String �Ű����� id�� �޾Ƽ� �ʵ尪 id�� �Ҵ�(����,����)
	public Member(String id) {
		this.id = id;
	}
	//�޼���: �ν��Ͻ��� �����ִ� ���

	/*�������̵��� ����� �޾Ƽ� �����Ǹ� �ϴ� �ǵ�,
		member�� ����� ��� �޾�����?
		��� Ŭ������ object��� Ŭ�������� ���۵Ǹ� ��ӹ޴´�.
		equls�� �������ؼ� ���ο� �񱳱����� �����
		@: ������̼��� �Ʒ� �޼����� ������ JVM���� �������ִ� ����
		boolean : �� �޼��尡 ����ǰ� ���������� ��ȯ(����)�Ǵ�
		"Ÿ��"�� boolean(true/false �� �� �ϳ� ��ȯ )
		(Object obj) : �Ű������ν� � �ν��Ͻ��� Object�� "����ȯ"�ȴ�.
		� Ŭ������ Object ��ü�� ��� ��ӹޱ� ������ �ְ� �θ� Ŭ������ Object��
		"�ڵ� ����ȯ"�� �����ϴ� (Ÿ���� ����ȯ)
		member obj4 = new member("blue"); -> Object obj4 = new member("blue");*/
	@Override
	public boolean equals(Object obj) {
		//equals �⺻ ���� �޼ҵ带 ������ �Ϸ��� �Ѵ�. boolean�� �Ű����� �ʿ��ϴ�.
		// �׷��� �ֻ��� Ŭ������ Object�� �Ű�Ÿ�� obj ���������� �����Ѵ�.
		// Object obj�� ������ �ڽ� ��ü�� ��


	// ������ ������ �ν��Ͻ��� Ÿ���� Member�̱� ������ if���� true�� ���
		if(obj instanceof Member) {
	// Member Ÿ������ obj �Ű������� ����ȯ (����obj Ÿ������ ��ȯ�� ��ü�� Member���� Ȯ��)
	//member��� ���������� obj(�ּ�)�� ����

			Member member = (Member) obj;
			//����Ÿ�Ժ�ȯ : �ڽ�Ÿ�� Ÿ�Ը� = (�ڽ�Ÿ��) �θ�Ÿ�Ը�
			// �ϴ� ���� : �θ�Ÿ���� �޼ҵ带 �ڽ�Ÿ�� ��ü�� �޼ҵ� ������ �ϱ� ����
			if(id.equals(member.id)) {
			/*	id = member�� �ʵ尪
				id = String�̱� ������ ����Ÿ������ equals�� ���� ��
				�ν��Ͻ��� id��� �ʵ尪�� �Ű����� obj(member)�� id�� �� */
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		//String ���ڿ��� ���Ǯ�̱� ������ ���� �ּҸ� ����ĥ ���̰�
		//���� �ּ��̸� hashcode�� �����ϰ� return �޽��ϴ�.
		return id.hashCode();
	}
}
