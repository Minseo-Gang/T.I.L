package sec01.exam04;

public class SupersonicAirplane extends Airplane {
	// ��� ����
	public static final int NORMAL = 1;  // �Ϲݸ��
	public static final int SUPERSONIC = 2;  // �����Ӹ��
	
	// ���� ���� ���
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�");
		} else {
			super.fly();
		}
		
	}

	
	
	
}
