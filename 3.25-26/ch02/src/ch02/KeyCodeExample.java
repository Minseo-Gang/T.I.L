package ch02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		// quit
		
		while (true) {
			System.out.print("�ڵ尪�� ���� ���ڸ� �Է��ϼ���:");
			// system.in - Ű����(ǥ�� �Է� ��ġ)
			int code = System.in.read();
			
			if (code == 113) {
				break;
			}
			
			System.out.printf("�Է��� ������ �ڵ� ��: %d�Դϴ�.\n", code);
			
			// Enter -> \n\r, 13, 10
			System.in.read(); // \n ����
			System.in.read(); // \r ����
			
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		/*
		System.out.print("�ڵ尪�� ���� ���ڸ� �Է��ϼ���:");
		code = System.in.read();
		System.out.printf("�Է��� ������ �ڵ� ��: %d�Դϴ�.\n", code);
		
		System.out.println("���α׷��� �����մϴ�.");
		*/
		
	}

}
