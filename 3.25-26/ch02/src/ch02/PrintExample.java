package ch02;

public class PrintExample {

	public static void main(String[] args) {
		// println() - ��� �� ���� �ٲٱ� , ln = line
		// print() - ��� �� ���� �� �ٲ�
		// printf() - ����ȭ�� ���, f = format(����)
		
		System.out.println("1");
		System.out.println("2");
		System.out.print("3");
		System.out.print("4\n");
		
		int a = 100;
		System.out.printf("�̹��� ���� ���ڴ� %d�Դϴ�.", a); // d = decimal(10����)
		System.out.print("�̹��� ���� ���ڴ�" + a + "�Դϴ�");
		System.out.println();
		
		float b = 3.14f;
		System.out.printf("���� 2���� ���� %d, %.2f �Դϴ�\n", a, b);
		
	}

}
