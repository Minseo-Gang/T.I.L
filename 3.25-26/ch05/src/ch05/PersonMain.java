package ch05;

public class PersonMain {

	public static void main(String[] args) {
		//main - ���α׷��� ���� �κ�(��Ʈ��)
		
		//��Ģ - ������ = �ʱ�ȭ(new...)
		// ���� ���´� String s = new String("Hello"); // ��ü
		/* class ��� {
				�Ӽ�
				Ű, ������, �̸�...
				���
				�Ա�, �ڱ�, ���...
			}
			
			����� arthur = new ���();
			class Human {}
			Human arthur = new Human(); //������ �������� = ��ü;
			Human michael = new Human();
			arthur.Ű = 180;
			arthur.�Ļ�();
		*/
		
		Person arthur = new Person();
		arthur.height = 180.5;
		arthur.age = 30;
		System.out.println(arthur.height);
		System.out.println(arthur.age);
		arthur.sleep();
		String bread = arthur.buyBread();
		System.out.println(bread);
		
		Person sher = new Person();
		sher.height = 185.2;
		sher.age = 40;
		System.out.println(sher.height);
		System.out.println(sher.age);
		sher.sleep();
		String bread2 = sher.buyBread();
		System.out.println(bread2);
		
		System.out.println(arthur);
		System.out.println(sher);
		
		Person tarzan = new Person();
		System.out.println(tarzan.age);
		System.out.println(tarzan.address);
		
	} // main
	
} //class PersonMain

	//��ü ���� ���α׷��� (Object Oriented Programming(OOP))
	// ������ stack��, ��ü�� heap�� ������


class Person {
	// �Ӽ�
	// Heap ���� �ڵ� �ʱ�ȭ(�⺻��)
	// int - 0
	// double - 0.0
	// float - 0.0f
	// char - ' '
	// boolean - false
	// ������ - null
	
	double height;
	int age;
	String address;
	
	//���
	void sleep() {
		System.out.println("���� ��ϴ�");
		return; //������ ���� ������ ��������
	}
	
	String buyBread() {
		System.out.println("���� ��ϴ�");
		return "��"; //�Լ��� ������ �����ϰ� ��ȯ���� ������
		// System.out.println(); ���Ͽ��� �Լ������� ����ǹǷ� ������ ������
	}
	
}
