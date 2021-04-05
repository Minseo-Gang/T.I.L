package access01;

import access02.Dog;

public class AccessMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		// error p1.weight = 50.2;
		
		access02.Dog d1 = new access02.Dog(); // 같은 package 안에 없어서 Fullname기재해야됨
		
		Dog d2 = new Dog(); // import를 붙여서 수입가능
		
		d1.name = "아리";
		// d1.age = 1; // 같은 패키지에서는 접근 가능, 접근 불가해서 error
		// d1.weight = 10.5f; 도 error
	
		d1.eat();
		float w= d1.getWeight();
		System.out.println(w);
		
		d1.setWeight(-100f);
	}
}
