package sec04.exam04;

public class Calculator {

	// ���ϱ�
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// ��� ���ϱ�
	double avg(int x, int y) {
		int sum = plus(x, y);
		double result = sum / 2.0;
		return result;
	}
	
	// �����ϱ�
	void execute() {
		double result = avg(7, 10);
		println(String.valueOf(result));
	}
	
	// ����ϱ�
	void println(String message) {
		System.out.println("������: " + message);
	}
	
	
}
