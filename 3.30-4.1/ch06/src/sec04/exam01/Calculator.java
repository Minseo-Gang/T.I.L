package sec04.exam01;

public class Calculator {

	// ���� �ѱ�
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	
	// ���� - ���� �� 2���� �޾Ƽ� ���� ����� ��ȯ
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// ������ - ���� ���� 2���� �޾Ƽ� ���� ����� ��ȯ
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	// ���� ����
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	
	
}
