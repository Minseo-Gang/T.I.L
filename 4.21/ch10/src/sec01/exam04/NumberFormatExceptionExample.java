package sec01.exam04;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "3.14";
		String data3 = "ten";
		
		int iData1 = Integer.parseInt(data1);
		double dData2 = Double.parseDouble(data2);
		// "ten"이라는 문자열은 숫자화 할 수 없다 - NumberFormatException
		int iData3 = Integer.parseInt(data3);
		
		System.out.println(iData1 + dData2 + iData3);
		System.out.println("프로그램 종료");
		
	}

}
