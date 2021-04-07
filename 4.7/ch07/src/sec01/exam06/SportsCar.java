package sec01.exam06;

// 메서드에 final이 붙어도 상속은 허용됨
public class SportsCar extends Car {
	//public void stop() { }  // error : Cannot override the final method from Car
							// Car에 있는 final 메서드를 오버라이드 할 수 없다
}
