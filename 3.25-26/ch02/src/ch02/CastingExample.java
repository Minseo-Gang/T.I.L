package ch02;

public class CastingExample {
	
	public static void main(String[] args) {
		int a = 100;
		long b = a;  //a�� long������ �ڵ� ����ȯ
		System.out.println(b);
		
		long c = 100L;
		int d = (int)c;
		System.out.println(d);
		
		// �Ǽ��� �������� ū ���� ǥ���� �� �ִ�
		float f = 3.14f;
		int f2 = (int)f; // ������ �߷��� �������� ����ȯ�ϼ� �ϰ� ��ǻ������ ����
		System.out.println(f2);
		
		// 1 ~ 21
		int num = (int)(Math.random() * 21) + 1;
		System.out.println(num);
		

	}
}
