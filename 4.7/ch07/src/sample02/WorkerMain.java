package sample02;

public class WorkerMain {

	public static void main(String[] args) {
		// ��ĳ���� - ����Ŭ������ Ÿ���� ���� Ÿ������ �ٶ�
		Worker w1 = new Salesman();
		Worker w2 = new Programmer();
		Worker w3 = new Designer();
		
		//w1.manageClient();
		//w2.codeDebugging();
		//w3.drawingLogo(); ������.. w1, w2, w3�� ��� worker�� ���� ����
		
		// �ٿ�ĳ���� - ����Ÿ������ �ٶ�ô� ����Ÿ���� �ٽ� ������ Ÿ������ ����
		Salesman s1 = (Salesman)w1;
		s1.manageClient();
		Programmer p1 = (Programmer)w2;
		p1.codeDebugging();
		Designer d1 = (Designer)w3;
		d1.drawingLogo();
		
		// ���� : �ٿ�ĳ������ ������ Ÿ������ ���ư��� ����
		
		
//		Worker[] workers = {w1, w2, w3};
//		
//		for(Worker w : workers) {
//			w.work();
//		}

	}

}
