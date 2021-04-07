package ex04;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrameAdd3Button extends JFrame {
	Container c = getContentPane();
	JButton btn1 = new JButton("��ư1");
	JButton btn2 = new JButton("��ư2");
	JButton btn3 = new JButton("��ư3");
	
	public MyFrameAdd3Button() {
		// �⺻ â�ݱ� ������ "���� �� ����"�ǵ��� ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��ġ������ - BorderLayout(�⺻)
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50)); // ��ġ������ ����
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		setTitle("��ư 3�� �޸� â");
		setSize(500, 500);
		c.setBackground(Color.BLACK);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrameAdd3Button();
	}
}
