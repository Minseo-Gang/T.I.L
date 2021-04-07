package ex06;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyGridLayout extends JFrame{
	
	Container c = getContentPane();
	
	public MyGridLayout() {
		// â�ݱ� �ɼ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �����̳��� ���̾ƿ��� �׸��� ���̾ƿ����� ����
		c.setLayout(new GridLayout(4, 3, 10, 10));
		// ��ư 12�� �����
		for (int i = 1; i <= 12; i++) {
			c.add(new JButton(String.valueOf(i)));
		}
		// âũ��
		setSize(500, 500);
		// â����
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyGridLayout();
	}

}
