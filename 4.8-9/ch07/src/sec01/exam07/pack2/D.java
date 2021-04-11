package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	// 다른 패키지에 잇으나 상속관계에 있는 클래스에서 protected에 접근하기
	// 접근가능함
	
	// 생성자
	public D() {
		super(); // 상위클래스(A)의 생성자
		this.field = "value";
		this.method();
		
	}
}
