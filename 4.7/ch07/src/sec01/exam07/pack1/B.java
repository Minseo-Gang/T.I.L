package sec01.exam07.pack1;

public class B {
	public void method() {
		// protected�� ���� A�� ����� �����ϱ�
		// ���� ��Ű���� �ִ� B���� ������ ������
		A a = new A();
		a.field = "value";
		a.method();
	}
}
