package sec05.exam02;

public class Calculator {

	// ������ - ������ �� : 3.14
	// 2 * ������ * ������
	// ����� �빮�ڷ� ���°��� ����
	static final double MATH_PI = 3.14;
	
	// �ѷ� ���ϱ�
	static double getCircum(int r) {
		return 2 * MATH_PI * r;
	}
	
	// �������ϱ�
	static double getArea(int r) {
		return MATH_PI * r * r;
	}
	
	
}
