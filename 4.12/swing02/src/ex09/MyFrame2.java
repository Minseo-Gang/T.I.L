package ex09;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame2 extends JFrame implements ActionListener {
	
	Container c = getContentPane();
	JButton button = new JButton("��ư");
	JButton button2 = new JButton("��ư2");
	
	public MyFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�͸� Ŭ����");
		
		c.setLayout(new FlowLayout());
		c.add(button);
		c.add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyFrame2();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// button ��ü�� button2 ��ü�� MyFrame2�� ����̹Ƿ� �̰����� �ٷ� �����ٰ� �� �� �ִ�.
		// � ��ư�� ���� ��ü������ ��
		Object obj = e.getSource();
		// �ٽ� ��ư���� �ٶ󺸰� �ٿ�ĳ���� �ϴ� ���
		// JButton btn = (JButton)obj;
		if(obj == button) {
			System.out.println("ù��° ��ư Ŭ����");
		} else if(obj == button2) {
			System.out.println("�ι�° ��ư Ŭ����");
		}
		
	}
}
