package Prac07_3;

public class HttpServletExample {

	public static void main(String[] args) {
		
		method(new LoginServlet());
		method(new FileDownloadServlet());
		
	}
	// HttpServlet servlet이 업캐스팅한거라고 하는데...
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
