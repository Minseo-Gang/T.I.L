package ch04;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			System.out.println("������ 90�� �̻� �Դϴ�");
			System.out.println("����� A�Դϴ�");
		} else if(score >= 80) { // 90 > score �� ������ ���ԵǾ� ����
			System.out.println("������ 80~89�� �Դϴ�");
			System.out.println("����� B�Դϴ�");
		} else if(score >= 70) { // 80 > score
			System.out.println("������ 70~79�� �Դϴ�");
			System.out.println("����� C�Դϴ�");
		} else if(score >= 60) { // 70 > score
			System.out.println("������ 60~69�� �Դϴ�");
			System.out.println("����� D�Դϴ�");
		} else {
			System.out.println("������ 60�� �̸� �Դϴ�");
			System.out.println("����� F�Դϴ�");
		}

	}

}
