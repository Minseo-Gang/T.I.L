package ex02;

public class MainClass {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(1, 2);
		cal.sub(1, 2);
		cal.mul(1, 2);
		//int result = cal.div(1, 0);
		//int result = cal.div2(1, 0);
		//System.out.println(result);
		
		int[] arr = new int[5];
		
		try {
			for (int i = 0; i <= arr.length; i++) {
				arr[i] = i + 1;
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ÷�ڰ� ������ ���");
		} finally {
			System.out.println("����� ������ ����");
		} 
		
		  // finally�� ���� �߻� ���ο� ������� ������ �����
		  // catch�� �߻��� �� �ִ� ���� Ÿ�Կ� ���� ������ �ۼ� ����
		  // ��� ���ܸ� �Ѱ����� ó���ϰڴ� 
		  // -> ���� �ֻ��� Ÿ���� Exception���� �޾Ƽ� ó����
		
		System.out.println("����");

	}

}
