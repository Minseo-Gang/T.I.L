package sample02;

public class WorkerMain {

	public static void main(String[] args) {
		// 업캐스팅 - 하위클래스의 타입을 상위 타입으로 바라봄
		Worker w1 = new Salesman();
		Worker w2 = new Programmer();
		Worker w3 = new Designer();
		
		//w1.manageClient();
		//w2.codeDebugging();
		//w3.drawingLogo(); 에러남.. w1, w2, w3을 모두 worker로 보고 있음
		
		// 다운캐스팅 - 상위타입으로 바라봤던 하위타입을 다시 원래의 타입으로 보기
		Salesman s1 = (Salesman)w1;
		s1.manageClient();
		Programmer p1 = (Programmer)w2;
		p1.codeDebugging();
		Designer d1 = (Designer)w3;
		d1.drawingLogo();
		
		// 주의 : 다운캐스팅은 원래의 타입으로 돌아가는 것임
		
		
//		Worker[] workers = {w1, w2, w3};
//		
//		for(Worker w : workers) {
//			w.work();
//		}

	}

}
