package sec03.exam02;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
		System.out.println("프로그램 종료");
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
