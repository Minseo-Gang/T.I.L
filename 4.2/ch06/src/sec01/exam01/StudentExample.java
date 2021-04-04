package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		// 클래스명 변수명  = new 클래스명(); -> 클래스(설계도)를 이용해서 객체생성 
		// -> 변수명(객체명, 참조변수, 레퍼런스, 인스턴스....)
		Student s1 = new Student();
		System.out.println("s1변수가 Student 객체를 참조합니다" + s1);
		
		Student s2 = new Student();
		System.out.println("s2변수가 또 다른 Student 객체를 참조합니다" + s2);
		
		System.out.println("프로그램 종료");
	
	}

}
