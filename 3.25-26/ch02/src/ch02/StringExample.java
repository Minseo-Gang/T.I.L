package ch02;

public class StringExample {

	public static void main(String[] args) {
		 String name = "ȫ�浿";
		 // escape sequence (�̽������� ������)
		 String message = "�׳�� ������ ���ߴ�. \"����\" ���";
		 System.out.println(message);
		 System.out.println("1\t2\t3"); // \t = tab����
		 System.out.println("���� �׳࿡�� ���ߴ�.\n \"�׷�\""); // \n = new line : enter
		 System.out.println("D:\\workspace\\java"); // backslash ǥ���ϰ� ���� �� (\) : �ι� ����ϸ� ��
		 
		 int a = 2;
		 int b = 3;
		 boolean result = a < b;
		 boolean result2 = a > b;
		 System.out.println(result);
		 System.out.println(result2);
		 
		 // �ڵ� ����ȯ(�Ͻ��� ����ȯ)
		 	//int a = 100;
		 	//long b = a;
		 
		 // ���� ����ȯ(����� ����ȯ)
		 	// int <-> long
		 	// long c = 100L;
		 	// int d = (int)c; ū �����Ϳ��� ���� �����ͷ� �ű� ��, �����ڰ� ����� �ִ� ����
		 	// ������ <-> ������
		 	// but, int <-> boolean (x)
		 
	}

}
