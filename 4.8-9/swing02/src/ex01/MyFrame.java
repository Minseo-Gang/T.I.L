package ex01;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	Container c = getContentPane();
	JButton btn = new JButton("버튼");
	MyActionListener listener = new MyActionListener();
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("액션리스너");
		setSize(500, 500);
		//이름이 btn인 버튼에 이름이 listener인 액션감시를 붙임
		// listen 객체가 btn 객체의 Action 이벤트를 감시함
		// Action이 발생하면 -> actionPerformed()가 자동 실행됨
		btn.addActionListener(listener);
		c.add(btn);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
