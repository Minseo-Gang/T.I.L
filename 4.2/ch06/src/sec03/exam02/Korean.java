package sec03.exam02;

public class Korean {

	String nation = "대한민국"; // 국적
	String name;// 이름
	String ssn; // 주민번호
	
	Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	} // 생성자 생성 및 초기화 작업
	  // 개발자가 생성자를 정의하면
	// 컴파일러가 기본생성자인 Korean() { } 를 만들지 않음
	
}
