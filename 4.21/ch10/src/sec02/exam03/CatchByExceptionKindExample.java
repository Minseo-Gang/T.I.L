package sec02.exam03;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		try {
			// �迭�� ������ ����� ArrayIndexOutOfBoundsException �߻��� �� ����
			String data1 = args[0];
			String data2 = args[1];
		
			//�Ķ���ͷ� �Ѿ�� ���� ���ڷ� ������ �� NumberFormatException�� �߻��� �� ����
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("result: " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű������� ������ �����մϴ�.(2��)");
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�. ������ �Է��� �ּ���");
		} finally {
			System.out.println("�ٽ� �����ϼ���");
		}
		System.out.println("���α׷� ����");
	}

}
