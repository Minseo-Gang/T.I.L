package ex07;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame2 extends JFrame{
	// MyFrame2�� ���
	String name;
	
	// MyFrame2�� ���
	public MyFrame2() {
		name = "ȫ�浿";
	}
	
	// MyFrame2�� ���
	public void methodA() {
		name = "������";
	}
	
	// MyFrame2�� ���
	public class MyInnerClass{
		
		public void methodB() {
			name = "��ġ";
		}
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}
}
