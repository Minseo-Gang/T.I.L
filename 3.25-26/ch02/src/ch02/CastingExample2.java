package ch02;

public class CastingExample2 {

	public static void main(String[] args) {
		// ������ �⺻ ���� : int
		// ������ �� ��쿡�� ���� Ÿ�� ���� ū �ʿ� ����� (�ڵ� ����ȯ)
		int a = 10;
		float b = 10.5f;
		float c = a + b; // 10.0f(float���� �ڵ� ����ȯ) + 10.5f;
		System.out.println(c);
		
		// ���ڿ� ���� : +, ���ڿ��� ����� ���ڿ� �����͸� ������
		String s = "Hello";
		String s2 = s + a; //"Hello" + 10 -> "Hello" + "10"(���ڿ��� ����)
		System.out.println(s2);
		
		//parseInt
		float d = 3.14f;
		int e = (int)d;
		String f = "10"; //prompt("���ڸ� �Է����ּ���"); -> parseInt
		//int g = (int) f; //����ȯ�� ���� ������ ���� ����, f�� ���ڵ����Ͱ� �ƴ϶� ���ڵ�������
		int h = Integer.parseInt(f) + 10;
		System.out.println(h);
		
		String i = h + ""; // "20" + "" -> "20"
		System.out.println(i);
		String j = i + 20;
		System.out.println(j);
		
		String k = String.valueOf(h) + 20; //String.valueOf(); ��� ���� �־ string ���ڿ��� ��ȯ�� �� �ִ�
		System.out.println(k);
		
		
	}

}
