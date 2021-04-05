package sec04.exam02;

public class Computer {

	// 배열을 인자로 받아서
	int sum1(int[] values) { // 갯수가 1개 - 원소가 여러개
		
		System.out.println(values);
		
		int sum = 0;
		for(int val : values) {
			sum += val;
		}
		return sum;
	}
	
	
	// 복수형을 받아서
	int sum2(int...values) { // 갯수가 여러개 - 데이터가 여러개
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		return sum;
	}
	
}
