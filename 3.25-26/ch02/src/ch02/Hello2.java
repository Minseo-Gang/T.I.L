package ch02;

public class Hello2 {
	public static void main(String[] args) {
		//ctrl + space (�ڵ��ϼ�)
		System.out.println("Hello2");
		System.out.println("�ȳ��ϼ���"); //ctrl + alt + ����Ű : ����
		
		//byte b = 500; - error
		short s = 500;
		int i = 1000000;
		long l = 10000000000L;
		
		//int i2 = 3.14; - error
		float f = 3.14f;
		double d = 12334.123;
		
		// ������ �⺻ Ÿ�� : int
		// �Ǽ��� �⺻ Ÿ�� : double
		
		int a = 1 + 2;
		System.out.println(a);
		
		// ������ �⺻ Ÿ�� : int ** �߿��� **
		// �����Ϸ��� ���� üũ���� �ʴ´�!! Ÿ�Ը� üũ��
		
		char c = 'A'; // "A" -> string, char(x)
		
		boolean bo = true;
		// boolean bo = "true"; - error
		
		
	}
}

