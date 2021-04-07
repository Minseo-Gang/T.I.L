package ex02;

import javax.swing.JFrame;

@SuppressWarnings("serial") // 없어도 상관 x
public class MyFrame extends JFrame {
	
	public MyFrame() {
		// super();
		setTitle("두번째 창"); // this.setTitle에서 this 생략가능
		setSize(300, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
