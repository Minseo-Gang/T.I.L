package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class C {
	public void method() {
		// error : The constructor A() is not visible
		// protected
		// 상속 관계에 있지 않는 다른 패키지 클래스에서 접근해보기
		/*
		A a = new A();
		a.field = "value"; // error
		a.method(); // error
		*/
		
	}
}
