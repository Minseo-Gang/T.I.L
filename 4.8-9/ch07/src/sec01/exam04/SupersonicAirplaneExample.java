package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();  // �������� �̷��ϱ�
		sa.fly(); // �ʱ���� - NORMAL, �Ϲݺ��� - Airplane�� fly()
		sa.flyMode = SupersonicAirplane.SUPERSONIC; // ������ ����
		sa.fly(); // ������ ���� SupersonicAirplane�� fly()
		sa.flyMode = SupersonicAirplane.NORMAL; // ������ ����
		sa.fly(); // Airplane�� fly()
		sa.land(); // �������� �����ϱ�
	}

}
