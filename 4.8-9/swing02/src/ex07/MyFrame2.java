package ex07;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame2 extends JFrame{
	// MyFrame2ÀÇ ¸â¹ö
	String name;
	
	// MyFrame2ÀÇ ¸â¹ö
	public MyFrame2() {
		name = "È«±æµ¿";
	}
	
	// MyFrame2ÀÇ ¸â¹ö
	public void methodA() {
		name = "¸ÁµÕÀÌ";
	}
	
	// MyFrame2ÀÇ ¸â¹ö
	public class MyInnerClass{
		
		public void methodB() {
			name = "³ÒÄ¡";
		}
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}
}
