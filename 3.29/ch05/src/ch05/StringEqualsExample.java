package ch05;

public class StringEqualsExample {

	public static void main(String[] args) {
		// ���ڿ� ��ü vs ���ڿ� ���ͷ�(���)
		// "==" vs "equals();"
		
		// ���ڿ� ���ͷ� (�޸𸮿��� ���� �ƴ� ��� ������ ���ǵ�)
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		// ��������� �ִ� ���� ���ͷ��� ����Ų��
		
		// ������ �������� ��
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		// ���ڿ�(����)�� �������� ����
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		} else {
			System.out.println("strVar1�� strVar2�� ���ڿ��� �ٸ�");
		}
		
		// ���ڿ� ��ü
		String strVar3 = new String("������"); // ���빰(���ڿ�)�� �������� ��ü(����)
		String strVar4 = new String("������"); // ���빰(���ڿ�)�� �������� �� �ٸ� ��ü(����)
		
		// ������ �������� ��
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
		// ���ڿ� ������(���)�� �������� ����
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		} else {
			System.out.println("strVar3�� strVar4�� ���ڿ��� �ٸ�");
		}

		// ���ڿ� �񱳴� .equals()�� �������
	}

}
