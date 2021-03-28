package ch05;

public class PersonMain {

	public static void main(String[] args) {
		//main - 프로그램의 시작 부분(컨트롤)
		
		//원칙 - 참조형 = 초기화(new...)
		// 원래 형태는 String s = new String("Hello"); // 객체
		/* class 사람 {
				속성
				키, 몸무게, 이름...
				기능
				먹기, 자기, 놀기...
			}
			
			사람형 arthur = new 사람();
			class Human {}
			Human arthur = new Human(); //참조형 참조변수 = 객체;
			Human michael = new Human();
			arthur.키 = 180;
			arthur.식사();
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

	//객체 지향 프로그래밍 (Object Oriented Programming(OOP))
	// 변수는 stack에, 객체는 heap에 존재함


class Person {
	// 속성
	// Heap 변수 자동 초기화(기본값)
	// int - 0
	// double - 0.0
	// float - 0.0f
	// char - ' '
	// boolean - false
	// 참조형 - null
	
	double height;
	int age;
	String address;
	
	//기능
	void sleep() {
		System.out.println("잠을 잡니다");
		return; //있으나 내용 없으니 생략가능
	}
	
	String buyBread() {
		System.out.println("빵을 삽니다");
		return "빵"; //함수의 실행을 종료하고 반환값을 돌려줌
		// System.out.println(); 리턴에서 함수실행이 종료되므로 넣으면 에러남
	}
	
}
