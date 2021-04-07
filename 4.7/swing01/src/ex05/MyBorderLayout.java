package ex05;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyBorderLayout extends JFrame{
	// ��ġ�� ��ġ�� ����, ��ġ�� �������� ������ center�� 
	Container c = getContentPane();
	JButton btnNorth = new JButton("����");
	JButton btnSouth = new JButton("����");
	JButton btnEast = new JButton("����");
	JButton btnWest = new JButton("����");
	JButton btnCenter = new JButton("�߾�");
	
	public MyBorderLayout() {
		// ��ġ������ -> borderlayout
		// â�ݱ� �ɼ� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// â���� ����
		this.setTitle("���� ���̾ƿ�");
		// âũ�� ����
		this.setSize(500, 500);
		// ������Ʈ ����
		this.setComponents();
		// â ���̱�
		this.setVisible(true);
	}
	
	private void setComponents() {
		c.add(btnNorth, BorderLayout.NORTH);
		c.add(btnSouth, BorderLayout.SOUTH);
		c.add(btnEast, BorderLayout.EAST);
		c.add(btnWest, BorderLayout.WEST);
		c.add(btnCenter, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new MyBorderLayout();
	}

}
