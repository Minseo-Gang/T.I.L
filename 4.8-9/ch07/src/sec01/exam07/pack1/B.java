package sec01.exam07.pack1;

public class B {
	public void method() {
		// protected가 붙은 A의 멤버에 접근하기
		// 같은 패키지에 있는 B에서 접근이 가능함
		A a = new A();
		a.field = "value";
		a.method();
	}
}
