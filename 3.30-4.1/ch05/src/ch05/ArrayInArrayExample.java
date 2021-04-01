package ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 2차원 배열 - 표형태와 유사
		// 1차원 배열을 원소로 갖는 배열
		int[][] array = 
			{ 
				{1, 2}, 
				{3, 4}, 
				{5, 6}, 
				{7, 8} 
			};
		
		// 2차원 배열의 크기 - length 속성
		System.out.println(array.length); // 4개
		System.out.println(array); // @xxxxxx
		System.out.println(array[0]); //@xxxxx
		System.out.println(array[0][0]); // 1
		System.out.println(array[0].length); // 2
		System.out.println(array[2][0]); // 5
		
		// 어떤 회사의 3년치 각 분기별 매출액
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
		
		//ctrl + shift + C : 주석 자동으로 변경
		
		System.out.println(sales[1][2]);
		System.out.println(sales[2][3]);
		
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 4; i++) {
				System.out.print(sales[0][i] + " ");
			}
			System.out.println();
		}
		
		// 3년치 매출 총액
		int sum = 0;
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 4; i++) {
				sum += sales[j][i];
			}
		}
		System.out.println("3년치 매출 총액:" + sum);
		System.out.println("3년치 매출 총액에 대한 연평균 매출:" + ((float)sum / sales.length));
		
		
	}

}
