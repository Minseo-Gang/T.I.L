package ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// �迭 �����ϸ鼭 ������ �ֱ� - { 1, 2, 3, 4, 5}
		// ������ ������ ���� ���� ������ �ֱ� - new Ű����
	
		int[] arr1 = new int[3]; //���� 3���� �� ���� 3�� ¥�� ����
		// arr1�� �� Ȯ��
		System.out.println("arr1 " + arr1);
		
		// arr1�� ���� �� Ȯ��
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
		}
		// ������ �⺻���� 0���� ���õǾ� �ִ�
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		// arr1�� ���� �� Ȯ��
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
		}
		
		// �Ǽ��� �迭 arr2 - 3��
		double[] arr2 = new double[3];
		// arr2�� �� Ȯ��
		System.out.println("arr2 " + arr2);
		// arr2�� ���� �� Ȯ��
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2[%d]: %f\n", i, arr2[i]);
		}
		// �Ǽ�(double)�� �⺻���� 0.0���� ���õǾ� �ִ�
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		// arr2�� ���� �� Ȯ��
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2[%d]: %f\n", i, arr2[i]);
		}
		
		// ���ڿ���(������) �迭 arr3 - 3��
		String[] arr3 = new String[3];
		// arr3�� �� Ȯ��
		System.out.println("arr3 " + arr3);
		
		// ���� ���� arr3�� ���� Ȯ��
		for(int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3[%d]: %s\n", i, arr3[i]);
		}
		// �������� �⺻���� null�� ���õǾ� �ִ�
		
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		// arr3�� �� ���Ұ� Ȯ��
		for(int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3[%d]: %s\n", i, arr3[i]);
		}
		
		//MyBall(������) 3���� ���� �迭 arr4 ����
		MyBall[] arr4 = new MyBall[3];
		
		// ������ ���� arr4�� ���� Ȯ��
		for(int i = 0; i < arr4.length; i++) {
			System.out.printf("arr4[%d]: %s\n", i, arr4[i]);
		}
		
		for(int i = 0; i < arr4.length; i++) {
			MyBall aBall = new MyBall();
			aBall.number = i + 1;
			aBall.color = "Black";
			arr4[i] = aBall;
		}
		
		// arr4�� ���Ұ� Ȯ��
		for(int i = 0; i < arr4.length; i++) {
			System.out.printf("arr4[%d]: %d[%s]\n", i, arr4[i].number, arr4[i].color);
			//%d: decimal(10������), %f: float(�Ǽ�), %s: String(���ڿ�)
		}
		
	}

}

class MyBall {
	int number;
	String color;
}