package ch04;

public class SwitchExample {

	public static void main(String[] args) {
		// �ֻ��� : 1 ~ 6 ������ ��
		int num = (int)(Math.random() * 6) + 1;
		String sNum = String.valueOf(num);

		switch(sNum) {
		case "1":
			System.out.println("1���� ���Խ��ϴ�");
			break;
		case "2":
			System.out.println("2���� ���Խ��ϴ�");
			break;
		case "3":
			System.out.println("3���� ���Խ��ϴ�");
			break;
		case "4":
			System.out.println("4���� ���Խ��ϴ�");
			break;
		case "5":
			System.out.println("5���� ���Խ��ϴ�");
			break;
		case "6":
			System.out.println("6���� ���Խ��ϴ�");
			break;
		} //switch
		
		/*
		switch(num) {
		case 1:
			System.out.println("1���� ���Խ��ϴ�");			
			break;
		case 2:
			System.out.println("2���� ���Խ��ϴ�");
			break;
		case 3:
			System.out.println("3���� ���Խ��ϴ�");
			break;
		case 4:
			System.out.println("4���� ���Խ��ϴ�");
			break;
		case 5:
			System.out.println("5���� ���Խ��ϴ�");
			break;
		case 6:
			System.out.println("6���� ���Խ��ϴ�");
			break;
		} //switch
		*/
		
	}//public static void

}//public class
