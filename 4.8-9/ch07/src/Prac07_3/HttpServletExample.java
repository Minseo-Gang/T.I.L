package Prac07_3;

public class HttpServletExample {

	public static void main(String[] args) {
		
		method(new LoginServlet());
		method(new FileDownloadServlet());
		
	}
	// HttpServlet servlet�� ��ĳ�����ѰŶ�� �ϴµ�...
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
