package access01;

import access02.Dog;

public class AccessMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ȫ�浿";
		p1.age = 20;
		// error p1.weight = 50.2;
		
		access02.Dog d1 = new access02.Dog(); // ���� package �ȿ� ��� Fullname�����ؾߵ�
		
		Dog d2 = new Dog(); // import�� �ٿ��� ���԰���
		
		d1.name = "�Ƹ�";
		// d1.age = 1; // ���� ��Ű�������� ���� ����, ���� �Ұ��ؼ� error
		// d1.weight = 10.5f; �� error
	
		d1.eat();
		float w= d1.getWeight();
		System.out.println(w);
		
		d1.setWeight(-100f);
	}
}
