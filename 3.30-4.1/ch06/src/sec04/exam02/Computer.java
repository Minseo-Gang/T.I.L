package sec04.exam02;

public class Computer {

	// �迭�� ���ڷ� �޾Ƽ�
	int sum1(int[] values) { // ������ 1�� - ���Ұ� ������
		
		System.out.println(values);
		
		int sum = 0;
		for(int val : values) {
			sum += val;
		}
		return sum;
	}
	
	
	// �������� �޾Ƽ�
	int sum2(int...values) { // ������ ������ - �����Ͱ� ������
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		return sum;
	}
	
}
