package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Animal ani1 = new Dog(); //up-casting
		changeDog(ani1);
		
		Animal ani2 = new Cat(); // up-casting
		changeDog(ani2);
	}
	
	public static void changeDog(Animal animal) {
		Dog dog1 = (Dog)animal; //down-casting
								// Cat -> Animal -> Dog (x), 형제관계같은거 음슴
								// ClassCastException
		System.out.println(dog1);
		
	}

} 

class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }