package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		
		/*
		// 생성자 데이터가 없을 경우;
		 
		Korean k1 = new Korean(); -> 빈 생성자가 있는 변수 설정가능함
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		*/
		
		// 생성자 데이터를 정의한 경우
		
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println(k1.nation); // 대한민국
		System.out.println(k1.name); // 박자바
		System.out.println(k1.ssn); // 011225-1234567
		
		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println(k2.nation); // 대한민국
		System.out.println(k2.name); // 김자바
		System.out.println(k2.ssn); // 930525-0654321
		
		Korean k3 = new Korean("이자바", "111112-1111111");
		
	}

}
