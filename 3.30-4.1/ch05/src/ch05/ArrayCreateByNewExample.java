package ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// 배열 생성하면서 데이터 넣기 - { 1, 2, 3, 4, 5}
		// 공간만 생성한 다음 따로 데이터 넣기 - new 키워드
	
		int[] arr1 = new int[3]; //정수 3개가 들어갈 공간 3개 짜리 생성
		// arr1의 값 확인
		System.out.println("arr1 " + arr1);
		
		// arr1의 원소 값 확인
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
		}
		// 정수의 기본값인 0으로 세팅되어 있다
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		// arr1의 원소 값 확인
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
		}
		
		// 실수형 배열 arr2 - 3개
		double[] arr2 = new double[3];
		// arr2의 값 확인
		System.out.println("arr2 " + arr2);
		// arr2의 원소 값 확인
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2[%d]: %f\n", i, arr2[i]);
		}
		// 실수(double)의 기본값이 0.0으로 세팅되어 있다
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		// arr2의 원소 값 확인
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2[%d]: %f\n", i, arr2[i]);
		}
		
		// 문자열형(참조형) 배열 arr3 - 3개
		String[] arr3 = new String[3];
		// arr3의 값 확인
		System.out.println("arr3 " + arr3);
		
		// 생성 직후 arr3의 원소 확인
		for(int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3[%d]: %s\n", i, arr3[i]);
		}
		// 참조형의 기본값은 null로 세팅되어 있다
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		// arr3의 각 원소값 확인
		for(int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3[%d]: %s\n", i, arr3[i]);
		}
		
		//MyBall(참조형) 3개를 담을 배열 arr4 정의
		MyBall[] arr4 = new MyBall[3];
		
		// 생성된 직후 arr4의 원소 확인
		for(int i = 0; i < arr4.length; i++) {
			System.out.printf("arr4[%d]: %s\n", i, arr4[i]);
		}
		
		for(int i = 0; i < arr4.length; i++) {
			MyBall aBall = new MyBall();
			aBall.number = i + 1;
			aBall.color = "Black";
			arr4[i] = aBall;
		}
		
		// arr4의 원소값 확인
		for(int i = 0; i < arr4.length; i++) {
			System.out.printf("arr4[%d]: %d[%s]\n", i, arr4[i].number, arr4[i].color);
			//%d: decimal(10진정수), %f: float(실수), %s: String(문자열)
		}
		
	}

}

class MyBall {
	int number;
	String color;
}