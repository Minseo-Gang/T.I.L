package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		
		/*
		// ������ �����Ͱ� ���� ���;
		 
		Korean k1 = new Korean(); -> �� �����ڰ� �ִ� ���� ����������
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		*/
		
		// ������ �����͸� ������ ���
		
		Korean k1 = new Korean("���ڹ�", "011225-1234567");
		System.out.println(k1.nation); // ���ѹα�
		System.out.println(k1.name); // ���ڹ�
		System.out.println(k1.ssn); // 011225-1234567
		
		Korean k2 = new Korean("���ڹ�", "930525-0654321");
		System.out.println(k2.nation); // ���ѹα�
		System.out.println(k2.name); // ���ڹ�
		System.out.println(k2.ssn); // 930525-0654321
		
		Korean k3 = new Korean("���ڹ�", "111112-1111111");
		
	}

}
