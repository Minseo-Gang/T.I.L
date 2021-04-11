package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("강민서", "111111-1111111", 10);
		System.out.println("이름 : " + student.name);
		System.out.println("주민번호 : " + student.ssn);
		System.out.println("학번 : " + student.studentNo);
		
	}

}
