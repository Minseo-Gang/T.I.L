package ex06;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame{

	Container c = getContentPane();
	JLabel myLabel = new JLabel("Java");
	MyKeyAdapter listener = new MyKeyAdapter();
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("직접해보기");
		
		c.setLayout(null);
		myLabel.setBounds(0, 0, 100, 50);
		c.add(myLabel);
		c.addKeyListener(listener);
		listener.setLblTarget(myLabel);
		setSize(300, 300);
		setVisible(true);
		
		c.requestFocus(); // 컨테이너가 키 이벤트를 받을 수 있도록 포커스를 요청함
		
	}
	

	public static void main(String[] args) {
		new MyFrame();
	}
}
