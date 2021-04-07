package sec02.exam03;

public class Car {
	// ¾Õ¹ÙÄû
	public Tire tire1;
	public Tire tire2;
	// µŞ¹ÙÄû
	public Tire tire3;
	public Tire tire4;
	
	public Car(Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
		super();
		this.tire1 = tire1;
		this.tire2 = tire2;
		this.tire3 = tire3;
		this.tire4 = tire4;
	}

	@Override
	public String toString() {
		return "Car [tire1=" + tire1 + ", tire2=" + tire2 + ", tire3=" + tire3 + ", tire4=" + tire4 + "]";
	}
	
	
	
	
	
	
}
