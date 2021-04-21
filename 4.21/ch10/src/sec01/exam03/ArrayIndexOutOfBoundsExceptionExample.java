package sec01.exam03;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		if(args.length == 3) {
			System.out.println("args[0]: " + args[0]);
			System.out.println("args[1]: " + args[1]);
			// 배열의 범위를 벗어난 예외 발생 - ArrayIndexOutOfBoundsException
			System.out.println("args[2]: " + args[2]);
		} else {
			System.out.println("3개의 매개변수가 필요합니다.");
		}
		System.out.println("프로그램 종료");
	}

}
