package ch05;

import java.util.Scanner;

public class ArrayInArrayScore2 {

		public static void main(String[] args) {
			String[] subjects = {"����", "����", "����"};
			Scanner scan = new Scanner(System.in);
			
			int studentCount = getCount(scan);
			
			int[][] scores = new int[studentCount][3];
			
			inputScores(studentCount, scores, subjects, scan);
			showAverageStudent(scores);
			showAverageSubject(scores, subjects);

		} // main
		
		public static void showAverageStudent(int[][] scores) {
			
			for(int j = 0; j < scores.length; j++) { //������ �ڵ� ������ ���ڴ� �ȳ����°� ����; ���� �����ϱ� ����
				int sum = 0;
				for(int i = 0; i < scores[j].length; i++) {
					sum += scores[j][i];
				}
				double average = (double) sum / scores[j].length;
				System.out.println((j + 1) +"��° �л� ��� : " + average); //�л� ���
			}
			
		} //showAverageStudent
	
		public static void showAverageSubject(int[][] scores, String[] subjects) {

			for(int l = 0; l < subjects.length; l++) {
				int sum = 0;
				for (int k = 0; k < scores.length; k++) {
					sum += scores [k][l];
				}
				double average2 = (double) sum / scores.length;
				System.out.println(subjects[l] + "���� ���: " + average2); // ���� ���
			}
			
		} //showAverageSubject
	
		public static void inputScores(int studentCount, int[][] scores, String[] subjects, Scanner scan) {
			
			for(int n = 0; n < studentCount; n++) {
				for(int i = 0; i < scores[0].length; i++) { 
					System.out.print((n + 1) + "��° �л�, "+ subjects[i] +"����>");
					int iScore = Integer.parseInt(scan.nextLine());
					scores[n][i] = iScore;
				}
			}
			
		} // inputScores
		
		public static int getCount(Scanner scan) {
			System.out.print("�л���> ");			
			int studentCount = Integer.parseInt(scan.nextLine());
			return studentCount;
		} // getCount
		
}
