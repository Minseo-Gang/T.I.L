package ch02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		// quit
		
		while (true) {
			System.out.print("코드값을 읽을 문자를 입력하세요:");
			// system.in - 키보드(표준 입력 장치)
			int code = System.in.read();
			
			if (code == 113) {
				break;
			}
			
			System.out.printf("입력한 글자의 코드 값: %d입니다.\n", code);
			
			// Enter -> \n\r, 13, 10
			System.in.read(); // \n 버림
			System.in.read(); // \r 버림
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		/*
		System.out.print("코드값을 읽을 문자를 입력하세요:");
		code = System.in.read();
		System.out.printf("입력한 글자의 코드 값: %d입니다.\n", code);
		
		System.out.println("프로그램을 종료합니다.");
		*/
		
	}

}
