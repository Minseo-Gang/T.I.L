package sec01.exam03;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		if(args.length == 3) {
			System.out.println("args[0]: " + args[0]);
			System.out.println("args[1]: " + args[1]);
			// �迭�� ������ ��� ���� �߻� - ArrayIndexOutOfBoundsException
			System.out.println("args[2]: " + args[2]);
		} else {
			System.out.println("3���� �Ű������� �ʿ��մϴ�.");
		}
		System.out.println("���α׷� ����");
	}

}
