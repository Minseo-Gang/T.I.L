package ex10;

public class Test01 {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		String front = ssn.substring(0, 6); // �ε��� 0~6 880815
		String rear = ssn.substring(7); // �ε��� 7~�� 1234567
		System.out.println("front " + front);
		System.out.println("rear " + rear);
		int len = ssn.length(); // �迭�� length�� "()"�� ����.
		System.out.println("ssn�� ���� : " + len);
		char ch = ssn.charAt(2);
		System.out.println("2��° �ε����� ���� :" + ch);
	}
	
}
