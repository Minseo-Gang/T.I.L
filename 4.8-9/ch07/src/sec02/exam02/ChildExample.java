package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		 // 자동 타입 변환
		Parent parent = child;
		parent.method1();
		parent.method2(); // child-method2()가 출력, child class에서 override 되어있음
		// parent.method3(); // error, 접근안됨 -> parent에는 method3가 없음
		
		child.method1();
		child.method2();
		child.method3();

	}

}
