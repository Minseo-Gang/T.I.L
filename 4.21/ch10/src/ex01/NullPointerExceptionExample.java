package ex01;

public class NullPointerExceptionExample {
	
	public static void main(String[] args) {
		// DB : �κ� ���ڿ�
		// substr
		String str = null;
		/*
		if(str != null) {
			String s = str.substring(0, 10);
			System.out.println(s);
		}
		*/
		
		try {
			String s = str.substring(0, 10);
			System.out.println(s);
		} catch (NullPointerException e) {
			System.out.println("Null���� ������ �� �����ϴ�.");
		}
		
		System.out.println("���α׷� ����");
	}
	
}
