package ch04;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'A'; // B��� ���ڵ����� 1���� ������ ���� grade�� ����
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�");
			break;
		case 'B': case 'b': //���� ��� �� ��쿡�� ���η� �� �ᵵ �������
			System.out.println("�Ϲ� ȸ���Դϴ�");
			break;
		default:
			System.out.println("�մ� �Դϴ�");
			break;
		}

	}

}
