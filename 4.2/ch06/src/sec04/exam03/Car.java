package sec04.exam03;

public class Car {

	int gas; // ���� �ֹ��� �ܷ�
	
	// setter : �ʵ��� ���� �����ϴ� �޼���
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// gas�� �����ִ����� ����
	boolean isLeftGas() {
		boolean isLeft = false;
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�");
		} else {
			System.out.println("gas�� �ֽ��ϴ�");
			isLeft = true;
		}
		return isLeft;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas �ܷ�:" + gas + ")");
				gas -= 1;
			} else { 
				System.out.println("����ϴ�. (gas �ܷ�:" + gas + ")");
				return;
			}

		}
		
	}
	
	
}
