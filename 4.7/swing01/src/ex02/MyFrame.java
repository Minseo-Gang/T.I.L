package ex02;

import javax.swing.JFrame;

@SuppressWarnings("serial") // ��� ��� x
public class MyFrame extends JFrame {
	
	public MyFrame() {
		// super();
		setTitle("�ι�° â"); // this.setTitle���� this ��������
		setSize(300, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
