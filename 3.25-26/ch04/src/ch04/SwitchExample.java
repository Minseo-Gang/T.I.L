package ch04;

public class SwitchExample {

	public static void main(String[] args) {
		// 주사위 : 1 ~ 6 임의의 수
		int num = (int)(Math.random() * 6) + 1;
		String sNum = String.valueOf(num);

		switch(sNum) {
		case "1":
			System.out.println("1번이 나왔습니다");
			break;
		case "2":
			System.out.println("2번이 나왔습니다");
			break;
		case "3":
			System.out.println("3번이 나왔습니다");
			break;
		case "4":
			System.out.println("4번이 나왔습니다");
			break;
		case "5":
			System.out.println("5번이 나왔습니다");
			break;
		case "6":
			System.out.println("6번이 나왔습니다");
			break;
		} //switch
		
		/*
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다");			
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
			break;
		} //switch
		*/
		
	}//public static void

}//public class
