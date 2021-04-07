package sec01.exam02;

public class Student extends People {
	// 필드
	public int studentNo;
	
	// 생성자
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //기본 생성자일때는 생략이 가능하지만 People은 현재 
							//String name, ssn이 매개변수로 들어간 생성자가 있으므로
							// super가 생략되면 에러남, 저렇게 넣어줘야됨
		this.name = name;
		this.ssn = ssn;	
		this.studentNo = studentNo;
	}
	
	
}
