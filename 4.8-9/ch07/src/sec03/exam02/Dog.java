package sec03.exam02;

public class Dog extends Animal {
//The type Dog must implement the inherited abstract method Animal.sound()
	//sound() �޼ҵ带 �����ϰų� 
	// public class "abstract" Dog�� �߻� Ŭ������ ������ ��
	
	// Animal.sound() �߻�޼��带 ��üȭ (������{ }�� �ۼ�)
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
