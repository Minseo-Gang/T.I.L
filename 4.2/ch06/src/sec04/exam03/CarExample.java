package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
	
		Car myCar = new Car();
		myCar.setGas(5);
		if(myCar.isLeftGas() == true) {
			System.out.println("����մϴ�");
			myCar.run();
		}


	}

}
