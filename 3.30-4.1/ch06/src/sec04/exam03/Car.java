package sec04.exam03;

public class Car {

	int gas; // 남은 휘발유 잔량
	
	// setter : 필드의 값을 설정하는 메서드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// gas가 남아있는지의 여부
	boolean isLeftGas() {
		boolean isLeft = false;
		if(gas == 0) {
			System.out.println("gas가 없습니다");
		} else {
			System.out.println("gas가 있습니다");
			isLeft = true;
		}
		return isLeft;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas 잔량:" + gas + ")");
				gas -= 1;
			} else { 
				System.out.println("멈춥니다. (gas 잔량:" + gas + ")");
				return;
			}

		}
		
	}
	
	
}
