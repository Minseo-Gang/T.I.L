package ex04;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MousePractice extends JFrame {

	int num = 0;
	Container c = getContentPane();
	String[] labelTexts = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
	MyMouseListener listener = new MyMouseListener();
	
	public MousePractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("직접해보기");
		setComponents();
		setSize(500, 500);
		setVisible(true);
	}
	
	public void setComponents() {
		
		c.setLayout(null);
		for(int i = 0; i < 10 ; i++) {
			JLabel label = new JLabel(String.valueOf(i + 1));
			int x = (int)(Math.random() * 100) + 1;
			int y = (int)(Math.random() * 100) + 1;
			label.setBounds(x, y, 100, 100);
			label.addMouseListener(listener);
			c.add(label);
		}
		
	}
	
	public static void main(String[] args) {
		new MousePractice();
	}
}
