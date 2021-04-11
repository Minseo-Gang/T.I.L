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
		setTitle("�����غ���");
		
		c.setLayout(null);
		myLabel.setBounds(0, 0, 100, 50);
		c.add(myLabel);
		c.addKeyListener(listener);
		listener.setLblTarget(myLabel);
		setSize(300, 300);
		setVisible(true);
		
		c.requestFocus(); // �����̳ʰ� Ű �̺�Ʈ�� ���� �� �ֵ��� ��Ŀ���� ��û��
		
	}
	

	public static void main(String[] args) {
		new MyFrame();
	}
}
