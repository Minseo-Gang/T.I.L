package sec01.exam02;

public class Student extends People {
	// �ʵ�
	public int studentNo;
	
	// ������
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //�⺻ �������϶��� ������ ���������� People�� ���� 
							//String name, ssn�� �Ű������� �� �����ڰ� �����Ƿ�
							// super�� �����Ǹ� ������, ������ �־���ߵ�
		this.name = name;
		this.ssn = ssn;	
		this.studentNo = studentNo;
	}
	
	
}
