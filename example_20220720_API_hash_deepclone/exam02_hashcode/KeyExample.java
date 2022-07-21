package example_20220720_API_hash_deepclone.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		//HashMap�̶�� Ÿ������ �����ϵ� �ȿ� ���� key��� ��ü�� String ���ڿ��� �ִ´�
		//= new HashMap<key, String> : heap �޸𸮿� �ν��Ͻ� �����
		//HashMap<String,String> : key��ġ�� String, value�� String
		//ket(String)���� �˻��ؼ� vaule(String)�� �޴´� (HashMap�� ����)
		//HashMap Ư¡ : key���� �ߺ� �ȵ�
		//key�� "���ؼ�", Value "��������"
		//key�� "���ؼ�", Value "���ļ���"
		//"���ؼ�"�� �˻��ϸ� "���ļ���"�� ���. "���ؼ�"�� �ߺ��Ǳ⿡ �� ���ļ����� ������
		//�ؽ���<Ű��(class),����> Ű���� ���� vaule�� ã�´�.
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//Key��� ��üŸ������ testKey��� ���������� Ÿ�� ����
		// = new Key(23); = heap �޸𸮿��� Key��� �ν��Ͻ��� ���� (��, ���ڰ� 23 ����)
		//������(�Ű����� 23) ����
		Key testkey = new Key(23);
		Key testkey_1 = new Key(23);
		System.out.println(testkey.hashCode());
		System.out.println(testkey_1.hashCode());
		System.out.println("----------------------------");

		//json �������� ���ͳ� ����� �ַ� �Ѵ�. (json ��� : key, value)
		//�ĺ�Ű "new Key(1)" �� "ȫ�浿"�� ������
		//hashMap�� put() : hashMap�� ������ �ֱ�
		//String[] a; a[0] = "���ؼ�" �� ����
		//a[0] = key, "���ؼ�" = "ȫ�浿" //Key���� �ߺ��� �ȵȴ�.
		hashMap.put(new Key(1), "ȫ�浿");
		hashMap.put(new Key(1),"���ؼ�");
		hashMap.put(testkey,"���ؼ�");
		
		//�ĺ�Ű "new Key(1)" �� "ȫ�浿"�� �о��
		//hashMap.get() : �ΰ���(key)�� �־ key�� �Բ� ���� value ��ȯ(���)
		//hashMap.get() �޼����� �񱳹��
		//new kiy(1)�̶�� get()�� �Ű������� ������ ���ο� �ν��Ͻ��� ��������� !!
		//ȫ�浿�� key���� �ٸ��ٰ� �ν� >> �ν��Ͻ�,�ּҰ� �޶� hashcode()�� �ٸ���.
		//�׷��� ȫ�浿�� Key�� �ٸ��ٰ� �ν� (hashcode() ������� ���� = HashMep�� �ڷ����� ����)
		// �׷��� �������̵��� ȫ�浿 �ּ�ó�� �� �����ϸ� null�� ���.
		String value  = hashMap.get(new Key(1));
		System.out.println(value);
		//"���ؼ�"�̶�� ���ڿ��� �θ� �ؽ��ڵ� �޼���
		System.out.println(hashMap.get(testkey).hashCode());

		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}
}


