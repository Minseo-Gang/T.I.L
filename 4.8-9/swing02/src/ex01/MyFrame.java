package ex01;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	Container c = getContentPane();
	JButton btn = new JButton("��ư");
	MyActionListener listener = new MyActionListener();
	
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�׼Ǹ�����");
		setSize(500, 500);
		//�̸��� btn�� ��ư�� �̸��� listener�� �׼ǰ��ø� ����
		// listen ��ü�� btn ��ü�� Action �̺�Ʈ�� ������
		// Action�� �߻��ϸ� -> actionPerformed()�� �ڵ� �����
		btn.addActionListener(listener);
		c.add(btn);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
