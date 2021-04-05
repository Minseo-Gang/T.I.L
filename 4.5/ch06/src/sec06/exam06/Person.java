package sec06.exam06;

public class Person {
	private String name;
	private int age;
	private float weight;
	
	public Person() {
		
	}
	
	public Person(String name, int age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	
	}
	
}
	
	
	
