package ex05;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{

	Container c = getContentPane();
	
	MyMouseAdapter listener = new MyMouseAdapter();
	JLabel myLabel = new JLabel("Java");
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("직접해보기");
		
		c.addMouseMotionListener(listener);
		listener.setLblTarget(myLabel);
		c.setLayout(null);
		myLabel.setBounds(10, 10, 50, 30);
		c.add(myLabel);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new MyFrame();
	}
}
