package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		// 상속 관계에서 하위 타입의 인스턴스를 상위 타입으로 형변환(자동 변환)
		
		A a1 = b; // 자동 타입 변환 (B [is-a] A)
		A a2 = c; // 자동 타입 변환 (C [is-a] A)
		A a3 = d; // 자동 타입 변환 (D [is-a] B [is-a] A)
		A a4 = e; // 자동 타입 변환 (E [is-a] C [is-a] A)
		
		B b1 = d; // 자동 타입 변환 (B [is-a] D)
		C c1 = e; // 자동 타입 변환 (E [is-a] C)
		
		/*
		B b3 = e; // error B와 E는 아무 관계가 없음
		C c3 = d; // C와 D는 아무 관계 없음
		*/
		
	}

}
