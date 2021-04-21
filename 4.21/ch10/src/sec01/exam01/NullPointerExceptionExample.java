package sec01.exam01;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		// null인 객체에 접근 -> NullPointerException
		System.out.println(data.toString());
		System.out.println("프로그램종료");

	}

}
