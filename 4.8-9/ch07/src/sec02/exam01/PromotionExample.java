package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		// ��� ���迡�� ���� Ÿ���� �ν��Ͻ��� ���� Ÿ������ ����ȯ(�ڵ� ��ȯ)
		
		A a1 = b; // �ڵ� Ÿ�� ��ȯ (B [is-a] A)
		A a2 = c; // �ڵ� Ÿ�� ��ȯ (C [is-a] A)
		A a3 = d; // �ڵ� Ÿ�� ��ȯ (D [is-a] B [is-a] A)
		A a4 = e; // �ڵ� Ÿ�� ��ȯ (E [is-a] C [is-a] A)
		
		B b1 = d; // �ڵ� Ÿ�� ��ȯ (B [is-a] D)
		C c1 = e; // �ڵ� Ÿ�� ��ȯ (E [is-a] C)
		
		/*
		B b3 = e; // error B�� E�� �ƹ� ���谡 ����
		C c3 = d; // C�� D�� �ƹ� ���� ����
		*/
		
	}

}
