package ch04;

public class Prac04_2 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) { //3의 배수의 합계 구하기
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
}
