package ch04;

public class BreakExample {

	public static void main(String[] args) {
		// 반복문 내에서 break - 반복을 중단하고, 반복문 밖의 다음 문장으로 이동함
		// 1 ~ 6 사이의 임의의 수를 구해서 구한 값이 6이 나올때 까지 반복 출력함
		
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			System.out.println("num:" + num);
			if (num == 6) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
