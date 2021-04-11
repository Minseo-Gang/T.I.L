package ex02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{

	Container c = getContentPane();
	JButton btn = new JButton("버튼");
	JPanel pnl = new JPanel();
	MyActionListener listener = new MyActionListener();
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("직접해보기");
		setSize(300, 300);
		setVisible(true);
		
		c.add(pnl, BorderLayout.NORTH);
		pnl.add(btn);
		btn.addActionListener(listener);
		btn.setBackground(Color.RED);
		btn.setBackground(Color.YELLOW);
	}
	

	public static void main(String[] args) {
		new MyFrame();
	}
}
