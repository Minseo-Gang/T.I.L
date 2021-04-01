package ch05;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] scores = {10, 20, 30};
		// scores.length = 4; 배열 길이 못늘림
		// scores[3] = 0; 인덱스 3은 없으므로 오류남
		
		int[] newScores = new int[6];
		
		System.arraycopy(scores, 0, newScores, 0, 3);
		
		for(int i = 0; i < newScores.length; i++) {
			System.out.println(newScores[i]);
		}
		
		/*
		for(int i = 0; i < scores.length; i++) {
			newScores[i] = scores[i];
		}
		
		scores = newScores;
		newScores = null;
		
		System.out.println("scores:" + scores);
		System.out.println("newScores:" + newScores);
		scores[3] = 40;
		scores[4] = 50;
		scores[5] = 60;
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		*/
		
	}

}
