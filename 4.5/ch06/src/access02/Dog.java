package access02;

public class Dog {
	public String name;
	int age;
	private float weight; // ������ ��ȣ ��ġ
	
	public void eat() {
		weight++;
	}
	
	// getter
	public float getWeight() {
		return weight;
	}
	
	// setter
	public void setWeight(float weight) {
		if(weight > 0) {
			this.weight = weight;
		}
	}
	
}
