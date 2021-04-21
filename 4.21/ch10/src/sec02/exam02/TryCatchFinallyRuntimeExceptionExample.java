package sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0]; // 10
			data2 = args[1]; // ���� �߻�
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ������ �����մϴ�");
		}
		
		try {
			int value1 = Integer.parseInt(data1); // "10" -> 10
			// ���ڿ� "ten"�� ���ڷ� ������ �� ���ٴ� ���� �߻�
			int value2 = Integer.parseInt(data2); // "ten" -> 10(x)
			int result = value1 + value2;
			System.out.println("result : " + result);
		} 
		//Integer.parseInt() �κп� ���� ���� ó�� 
		catch(NumberFormatException e) {
			System.out.println("���ڷ� ������ �� �����ϴ�");
		} 
		// try���� ���� ����ǰ�, catch���� ����ǰ� ������ �����
		finally {
			System.out.println("�ٽ� �����ϼ���");
		}
		
		System.out.println("���α׷� ����");

	}

}
