package sec02.exam01;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
			// Class.forName() 실행할 때 발생하는 ClassNotFoundException에 대한 처리
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}

		System.out.println("프로그램 종료");
		
	}

}
