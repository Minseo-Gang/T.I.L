package lotto2;

public class LottoBall {

	int number;
	String color;
	
	LottoBall(int number, String color) {
		this.number = number;
		this.color = color;
	}
	
	void showInfo() {
		System.out.println(number + "," + color);
	}
}
