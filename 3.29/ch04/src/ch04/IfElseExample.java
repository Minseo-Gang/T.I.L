package ch04;

public class IfElseExample {

	// �⺻������ ���α׷��� ������ �Ʒ���, �����ʿ��� ��������, ��ȣ()�켱���� �����
	public static void main(String[] args) {
		// ������ �����ϱ� ���� ������ ������ ���� �Ҵ� : 93
		int score = 93;
		
		// ������ 90�� �̻��̸� �ش� ���� ���
		if(score >= 90) {
			System.out.println("������ 90���� ũ�ų� �����ϴ�.");
			System.out.println("����� A�Դϴ�");
			
			//�׷��� �ʴٸ�(90�� �̸��� ���) �ٸ� �ش系���� �����
		} else {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�");
		} // if end
		
	}
	//IfExample�̶�� ���α׷��� ������
}