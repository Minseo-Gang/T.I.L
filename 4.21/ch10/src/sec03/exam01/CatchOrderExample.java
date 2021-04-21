package sec03.exam01;

public class CatchOrderExample {

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
		} 
		// catch 작성 순서는 하위클래스 -> 상위클래스 순으로 작성
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수의 갯수가 부족합니다.(2개)");
		} catch (Exception e) {
			System.out.println("실행시 문제가 있습니다");
		} finally {
			System.out.println("다시 실행하세요");
		}
		
		System.out.println("프로그램 종료");

	}

}
