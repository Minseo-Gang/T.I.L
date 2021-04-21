package sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0]; // 10
			data2 = args[1]; // 예외 발생
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 갯수가 부족합니다");
		}
		
		try {
			int value1 = Integer.parseInt(data1); // "10" -> 10
			// 문자열 "ten"을 숫자로 변경할 수 없다는 예외 발생
			int value2 = Integer.parseInt(data2); // "ten" -> 10(x)
			int result = value1 + value2;
			System.out.println("result : " + result);
		} 
		//Integer.parseInt() 부분에 대한 예외 처리 
		catch(NumberFormatException e) {
			System.out.println("숫자로 변경할 수 없습니다");
		} 
		// try블럭이 정상 실행되건, catch블럭이 실행되건 무조건 실행됨
		finally {
			System.out.println("다시 실행하세요");
		}
		
		System.out.println("프로그램 종료");

	}

}
