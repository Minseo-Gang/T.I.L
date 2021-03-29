package ch04;

public class ContinueExample {

	public static void main(String[] args) {
		// continue : continue 아래쪽의 문장들을 수행하지 않고 반복을 계속함
		
		// 1 ~ 10 중에서 짝수(n % 2 == 0)만 출력
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) { // 홀수라면
				continue; // 반복문 안에 있는 아래쪽 문장들을 수행하지 않고 반복 계속함
			}
			System.out.println(i);
		}
		
	}

}
