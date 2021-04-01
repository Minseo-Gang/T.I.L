package ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 2���� �迭 - ǥ���¿� ����
		// 1���� �迭�� ���ҷ� ���� �迭
		int[][] array = 
			{ 
				{1, 2}, 
				{3, 4}, 
				{5, 6}, 
				{7, 8} 
			};
		
		// 2���� �迭�� ũ�� - length �Ӽ�
		System.out.println(array.length); // 4��
		System.out.println(array); // @xxxxxx
		System.out.println(array[0]); //@xxxxx
		System.out.println(array[0][0]); // 1
		System.out.println(array[0].length); // 2
		System.out.println(array[2][0]); // 5
		
		// � ȸ���� 3��ġ �� �б⺰ �����
		int[][] sales = new int[3][4];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				// sales[?][0] = 100; // 100, 110, 120, 130
				// sales[?][0] = 100; // 100, 110, 120, 130
				// sales[?][0] = 100; // 100, 110, 120, 130
				// <- 100 + (0,1,2) * 10
				sales[j][i] = 100 + (i * 10); 
			} // for
			
			// 100, 110, 120, 130
			// 100, 110, 120, 130
			// 100, 110, 120, 130
			
		} //for
		
		//ctrl + shift + C : �ּ� �ڵ����� ����
		
		System.out.println(sales[1][2]);
		System.out.println(sales[2][3]);
		
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 4; i++) {
				System.out.print(sales[0][i] + " ");
			}
			System.out.println();
		}
		
		// 3��ġ ���� �Ѿ�
		int sum = 0;
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 4; i++) {
				sum += sales[j][i];
			}
		}
		System.out.println("3��ġ ���� �Ѿ�:" + sum);
		System.out.println("3��ġ ���� �Ѿ׿� ���� ����� ����:" + ((float)sum / sales.length));
		
		
	}

}
