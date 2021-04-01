package ch05;

import java.util.Scanner;

public class ArrayInArrayScore {

	public static void main(String[] args) {

		System.out.print("학생수> ");			

		Scanner scan = new Scanner(System.in);
		String[] subjects = {"국어", "수학", "영어"};
		int studentCount = Integer.parseInt(scan.nextLine());

		int[][] scores = new int[studentCount][3];

		for(int n = 0; n < studentCount; n++) {
			for(int i = 0; i < subjects.length; i++) { 
				System.out.print((n + 1) + "번째 학생, "+ subjects[i] +"점수>");
				scores[n][i] = Integer.parseInt(scan.nextLine()); // 주석 참조
			}
		}
				/*
				 해서 for 돌리면 됨! ㅇㅋㅇㅋ
				System.out.print("1번째 학생의 국어 점수>");
				String strkScore = scan.nextLine();
				int iKScore = Integer.parseInt(strkScore);
				scores[0][0] = iKScore;
				System.out.print("1번째 학생의 수학 점수>");
				String strEScore = scan.nextLine();
				int iEScore = Integer.parseInt(strEScore);
				scores[0][1] = iEScore;
				System.out.print("1번째 학생의 영어 점수>");
				String strMScore = scan.nextLine();
				int iMScore = Integer.parseInt(strMScore);
				scores[0][2] = iMScore;
				*/
				
		

			for(int j = 0; j < scores.length; j++) {
				int sum = 0;
				for(int i = 0; i < scores[j].length; i++) {
					sum += scores[j][i];
				}
				double average = (double) sum / scores[j].length; //float average = total / 3.0f; 로 해도 됨
				System.out.println((j + 1) +"번째 학생 평균 : " + average); //학생 평균
			}

			for(int l = 0; l < subjects.length; l++) {
				int sum = 0;
				for (int k = 0; k < scores.length; k++) {
					sum += scores [k][l];
				}
				double average2 = (double) sum / scores.length;
				System.out.println(subjects[l] + "과목별 평균: " + average2); // 과목 평균
			}

	}

}
