package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
			// Class.forName() ������ �� �߻��ϴ� ClassNotFoundException�� ���� ó��
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�");
		}

		System.out.println("���α׷� ����");
		
	}

}
