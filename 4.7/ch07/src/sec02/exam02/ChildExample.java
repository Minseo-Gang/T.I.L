package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		 // �ڵ� Ÿ�� ��ȯ
		Parent parent = child;
		parent.method1();
		parent.method2(); // child-method2()�� ���, child class���� override �Ǿ�����
		// parent.method3(); // error, ���پȵ� -> parent���� method3�� ����
		
		child.method1();
		child.method2();
		child.method3();

	}

}
