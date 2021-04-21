package sec02.exam03;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		try {
			// 배열의 범위를 벗어나는 ArrayIndexOutOfBoundsException 발생할 수 있음
			String data1 = args[0];
			String data2 = args[1];
		
			//파라미터로 넘어온 값을 숫자로 변경할 때 NumberFormatException이 발생할 수 있음
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("result: " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수의 갯수가 부족합니다.(2개)");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다. 정수를 입력해 주세요");
		} finally {
			System.out.println("다시 실행하세요");
		}
		System.out.println("프로그램 종료");
	}

}
